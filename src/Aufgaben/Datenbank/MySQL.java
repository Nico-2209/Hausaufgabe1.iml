package Aufgaben.Datenbank;

import java.sql.*;

public class MySQL {

    private static String url = "jdbc:mysql://localhost:3306/hauptzentrale";
    private static String user = "root";
    private static String password = "root";

    public static void main(String[] args) {


        readData();
    }

    public static void insertData(String nachname, String vorname) {
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

    public static void readData() {
        try {
            // Verbindung herstellen
            Connection conn = DriverManager.getConnection(url, user, password);

            // SQL-Befehl zum Auswählen aller Datensätze aus der Tabelle
            String sql = "SELECT * FROM kunden";

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
    public static void deleteDataWithID(int id) {
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