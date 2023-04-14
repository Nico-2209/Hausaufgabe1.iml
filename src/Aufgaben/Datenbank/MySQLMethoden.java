package Aufgaben.Datenbank;

import java.sql.*;

public abstract class MySQLMethoden {


    /**
     * F�gt einen neuen Kunden mit Nachname und Vorname in die Kundentabelle ein.
     *
     * @param nachname Der Nachname des neuen Kunden.
     * @param vorname  Der Vorname des neuen Kunden.
     * @param url      Die URL f�r die Verbindung zur Datenbank.
     * @param user     Der Benutzername f�r die Verbindung zur Datenbank.
     * @param password Das Passwort f�r die Verbindung zur Datenbank.
     */
    public static void addKundenToKundenTabelle(String nachname, String vorname, String url, String user, String password) {
        try {
            // Verbindung herstellen
            Connection conn = DriverManager.getConnection(url, user, password);

            // SQL-Befehl zum Einf�gen eines neuen Datensatzes
            String sql = "INSERT INTO kunden (kunden_Nachname, kunden_Vorname) VALUES (?, ?)";

            // Prepared Statement erstellen
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nachname); // Nachname setzen
            stmt.setString(2, vorname); // Vorname setzen

            // Datensatz einf�gen
            int rowsAffected = stmt.executeUpdate();

            System.out.println(rowsAffected + " Datensatz(e) hinzugefuegt.");

            // Verbindung schlie�en
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Ruft alle Datens�tze aus der angegebenen Tabelle ab und gibt sie auf der Konsole aus.
     *
     * @param tabelle  Der Name der Tabelle, aus der die Datens�tze abgerufen werden sollen.
     * @param url      Die URL f�r die Verbindung zur Datenbank.
     * @param user     Der Benutzername f�r die Verbindung zur Datenbank.
     * @param password Das Passwort f�r die Verbindung zur Datenbank.
     */
    public static void getTabelle(String tabelle, String url, String user, String password) {
        try {
            // Verbindung herstellen
            Connection conn = DriverManager.getConnection(url, user, password);

            // SQL-Befehl zum Ausw�hlen aller Datens�tze aus der Tabelle
            String sql = "SELECT * FROM " + tabelle;

            // Prepared Statement erstellen
            PreparedStatement stmt = conn.prepareStatement(sql);

            // Datens�tze abrufen
            ResultSet rs = stmt.executeQuery();

            // Ergebnis auf der Konsole ausgeben
            while (rs.next()) {
                int id = rs.getInt("ID");
                String nachname = rs.getString("kunden_Nachname");
                String vorname = rs.getString("kunden_Vorname");
                System.out.println(id + "\t" + nachname + "\t" + vorname);
            }

            // Verbindung schlie�en
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * L�scht den Datensatz mit der angegebenen ID aus der Kundentabelle.
     *
     * @param id       Die ID des Datensatzes, der gel�scht werden soll.
     * @param url      Die URL f�r die Verbindung zur Datenbank.
     * @param user     Der Benutzername f�r die Verbindung zur Datenbank.
     * @param password Das Passwort f�r die Verbindung zur Datenbank.
     */
    public static void deleteKundeWithID(int id, String url, String user, String password) {
        try {
            // Verbindung herstellen
            Connection conn = DriverManager.getConnection(url, user, password);

            // SQL-Befehl zum L�schen eines Datensatzes
            String sql = "DELETE FROM kunden WHERE ID = ?";

            // Prepared Statement erstellen
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id); // ID des zu l�schenden Datensatzes setzen

            // Datensatz l�schen
            int rowsAffected = stmt.executeUpdate();

            System.out.println(rowsAffected + " Datensatz(e) geloescht.");

            // Verbindung schlie�en
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
