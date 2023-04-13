package Aufgaben.Datenbank;

import java.sql.*;


public class MySQLToAccess {

    // JDBC-URLs f�r MySQL und Access
    private static String mysqlUrl = "jdbc:mysql://localhost:3306/hauptzentrale";
    private static String accessUrl = "jdbc:ucanaccess://C:/Users/Nico/Documents/Acces Tabellen/Hauptzentrale.accdb";

    private static String mysqlUser = "root";
    private static String mysqlPassword = "root";

    public static void main(String[] args) {

        try {
            // Verbindung zur MySQL-Datenbank herstellen
            Connection mysqlConn = DriverManager.getConnection(mysqlUrl, mysqlUser, mysqlPassword);

            // SQL-Befehl zum Abrufen der Tabellennamen
            String tableQuery = "SHOW TABLES";

            // Prepared Statement f�r den Tabellennamen-Abfrage vorbereiten
            PreparedStatement tableStmt = mysqlConn.prepareStatement(tableQuery);

            // Tabellennamen abrufen
            ResultSet tablesResult = tableStmt.executeQuery();

            // Access-Datenbankverbindung herstellen
            Connection accessConn = DriverManager.getConnection(accessUrl);

            // Schleife durch alle Tabellen
            while (tablesResult.next()) {
                String tableName = tablesResult.getString(1);

                // SQL-Befehl zum Abrufen aller Datens�tze einer Tabelle
                String dataQuery = "SELECT * FROM " + tableName;

                // Prepared Statement f�r den Datensatz-Abfrage vorbereiten
                PreparedStatement dataStmt = mysqlConn.prepareStatement(dataQuery);

                // Datens�tze abrufen
                ResultSet dataResult = dataStmt.executeQuery();

                // Metadaten der Tabelle abrufen
                ResultSetMetaData metadata = dataResult.getMetaData();

                // Anzahl der Spalten der Tabelle
                int columnCount = metadata.getColumnCount();

                // SQL-Befehl zum Erstellen der Tabelle in der Access-Datenbank
                String createTableQuery = "CREATE TABLE " + tableName + " (";

                // Spaltenname und -typ zur CREATE TABLE-Anweisung hinzuf�gen
                for (int i = 1; i <= columnCount; i++) {
                    String columnName = metadata.getColumnName(i);
                    String columnType = metadata.getColumnTypeName(i);
                    createTableQuery += columnName + " " + columnType;
                    if (i < columnCount) {
                        createTableQuery += ", ";
                    }
                }

                createTableQuery += ")";

                // CREATE TABLE-Anweisung ausf�hren
                Statement createStmt = accessConn.createStatement();
                createStmt.executeUpdate(createTableQuery);

                // Datens�tze in die Access-Datenbank kopieren
                while (dataResult.next()) {
                    String insertQuery = "INSERT INTO " + tableName + " VALUES (";
                    for (int i = 1; i <= columnCount; i++) {
                        String value = dataResult.getString(i);
                        insertQuery += "'" + value + "'";
                        if (i < columnCount) {
                            insertQuery += ", ";
                        }
                    }
                    insertQuery += ")";
                    Statement insertStmt = accessConn.createStatement();
                    insertStmt.executeUpdate(insertQuery);
                }
            }

            // Verbindungen schlie�en
            mysqlConn.close();
            accessConn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}