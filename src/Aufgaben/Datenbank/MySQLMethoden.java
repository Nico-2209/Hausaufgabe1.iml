package Aufgaben.Datenbank;

import java.sql.*;

public abstract class MySQLMethoden {


    /**
     * Fügt einen neuen Kunden mit Nachname und Vorname in die Kundentabelle ein.
     *
     * @param nachname Der Nachname des neuen Kunden.
     * @param vorname  Der Vorname des neuen Kunden.
     * @param url      Die URL für die Verbindung zur Datenbank.
     * @param user     Der Benutzername für die Verbindung zur Datenbank.
     * @param password Das Passwort für die Verbindung zur Datenbank.
     */
    public static void addKundenToKundenTabelle(String nachname, String vorname, String url, String user, String password) {
        try {
            // Verbindung herstellen
            Connection conn = DriverManager.getConnection(url, user, password);

            // SQL-Befehl zum Einfügen eines neuen Datensatzes
            String sql = "INSERT INTO kunden (kunden_Nachname, kunden_Vorname) VALUES (?, ?)";

            // Prepared Statement erstellen
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nachname); // Nachname setzen
            stmt.setString(2, vorname); // Vorname setzen

            // Datensatz einfügen
            int rowsAffected = stmt.executeUpdate();

            System.out.println(rowsAffected + " Datensatz(e) hinzugefuegt.");

            // Verbindung schließen
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Ruft alle Datensätze aus der angegebenen Tabelle ab und gibt sie auf der Konsole aus.
     *
     * @param tabelle  Der Name der Tabelle, aus der die Datensätze abgerufen werden sollen.
     * @param url      Die URL für die Verbindung zur Datenbank.
     * @param user     Der Benutzername für die Verbindung zur Datenbank.
     * @param password Das Passwort für die Verbindung zur Datenbank.
     */
    public static void getTabelle(String tabelle, String url, String user, String password) {
        try {
            // Verbindung herstellen
            Connection conn = DriverManager.getConnection(url, user, password);

            // SQL-Befehl zum Auswählen aller Datensätze aus der Tabelle
            String sql = "SELECT * FROM " + tabelle;

            // Prepared Statement erstellen
            PreparedStatement stmt = conn.prepareStatement(sql);

            // Datensätze abrufen
            ResultSet rs = stmt.executeQuery();

            // Ergebnis auf der Konsole ausgeben
            while (rs.next()) {
                int id = rs.getInt("ID");
                String nachname = rs.getString("kunden_Nachname");
                String vorname = rs.getString("kunden_Vorname");
                System.out.println(id + "\t" + nachname + "\t" + vorname);
            }

            // Verbindung schließen
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Löscht den Datensatz mit der angegebenen ID aus der Kundentabelle.
     *
     * @param id       Die ID des Datensatzes, der gelöscht werden soll.
     * @param url      Die URL für die Verbindung zur Datenbank.
     * @param user     Der Benutzername für die Verbindung zur Datenbank.
     * @param password Das Passwort für die Verbindung zur Datenbank.
     */
    public static void deleteKundeWithID(int id, String url, String user, String password) {
        try {
            // Verbindung herstellen
            Connection conn = DriverManager.getConnection(url, user, password);

            // SQL-Befehl zum Löschen eines Datensatzes
            String sql = "DELETE FROM kunden WHERE ID = ?";

            // Prepared Statement erstellen
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id); // ID des zu löschenden Datensatzes setzen

            // Datensatz löschen
            int rowsAffected = stmt.executeUpdate();

            System.out.println(rowsAffected + " Datensatz(e) geloescht.");

            // Verbindung schließen
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
