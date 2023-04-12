package Aufgaben.Praxisbeispiele.Beispiel1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Sortiment {
    private ArrayList<Produkte> artikelListe = new ArrayList<Produkte>();

    public ArrayList<Produkte> getArtikelListe() {
        return artikelListe;
    }

    public void setArtikelListe(ArrayList<Produkte> artikelListe) {
        this.artikelListe = artikelListe;
    }

    public void warenlieferung() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Geben Sie die Artikelnummer des neuen Produkts ein: ");
        int artnr = Integer.parseInt(reader.readLine());
        System.out.print("Geben Sie den Namen des neuen Produkts ein: ");
        String name = reader.readLine();
        System.out.print("Geben Sie den Preis des neuen Produkts ein: ");
        double preis = Double.parseDouble(reader.readLine());
        System.out.print("Geben Sie die Anzahl des neuen Produkts ein: ");
        int anzahl = Integer.parseInt(reader.readLine());
        Produkte neuesProdukt = new Produkte(artnr,name,preis,anzahl);
        artikelListe.add(neuesProdukt);
        System.out.println("Die Warenlieferung wurde erfolgreich hinzugefügt.");
    }

    public void verkaufen() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Geben Sie den Namen des Artikels ein, den Sie verkaufen möchten: ");
        String name = reader.readLine();
        Produkte produktZumVerkauf = null;
        for (Produkte artikel : artikelListe) {
            if (artikel.getProduktbezeichnung().equalsIgnoreCase(name)) {
                produktZumVerkauf = artikel;
                break;
            }
        }
        if (produktZumVerkauf == null) {
            System.out.println("Der Artikel ist nicht im Sortiment vorhanden.");
            return;
        }
        System.out.print("Geben Sie die Anzahl der verkauften Artikel ein: ");
        int anzahl = Integer.parseInt(reader.readLine());
        if (anzahl > produktZumVerkauf.getAnzahl()) {
            System.out.println("Es sind nicht genug Artikel im Sortiment vorhanden.");
            return;
        }
        produktZumVerkauf.setAnzahl(produktZumVerkauf.getAnzahl() - anzahl);
        System.out.println("Der Verkauf wurde erfolgreich durchgeführt.");
    }

    public void sonderangebot() {
        // Schritt 1: Benutzer nach dem Namen des Sonderangebots fragen
        System.out.print("Geben Sie den Namen des Sonderangebots ein: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        // Schritt 2: Benutzer nach dem Rabatt fragen
        System.out.print("Geben Sie den Rabatt in Prozent ein: ");
        double rabatt = scanner.nextDouble();
        scanner.nextLine(); // leere Eingabeaufforderung aus dem Scanner-Puffer entfernen

        // Schritt 3: Neue Liste für Sonderangebots-Artikel erstellen
        ArrayList<Produkte> sonderangebote = new ArrayList<>();

        // Schritt 4: Durch alle Artikel im Sortiment iterieren
        for (Produkte artikel : artikelListe) {
            // Schritt 5: Benutzer nach Bestätigung für Sonderangebot fragen
            System.out.print("Möchten Sie den Artikel \"" + artikel.getProduktbezeichnung() + "\" zum Sonderangebot hinzufügen? (J/N): ");
            String antwort = scanner.nextLine();

            // Schritt 6: Wenn der Benutzer den Artikel zum Sonderangebot hinzufügen möchte, füge ihn zur Liste hinzu
            if (antwort.equalsIgnoreCase("J")) {
                sonderangebote.add(artikel);
            }
        }

        // Schritt 7: Rabatt auf alle Sonderangebots-Artikel anwenden
        for (Produkte artikel : sonderangebote) {
            artikel.setPreis(artikel.getPreis() * (1 - rabatt / 100));
        }

        // Schritt 8: Benutzer über Erfolg des Sonderangebots informieren
        System.out.println("Das Sonderangebot \"" + name + "\" mit einem Rabatt von " + rabatt + "% wurde auf folgende Artikel angewendet:");
        for (Produkte artikel : sonderangebote) {
            System.out.println("- " + artikel.getProduktbezeichnung() + " (alter Preis: " + artikel.getPreis() / (1 - rabatt / 100) + "€, neuer Preis: " + artikel.getPreis() + "€)");
        }
    }

    public void ausgeben() {
        System.out.println("Sortiment:");
        for (Produkte artikel : artikelListe) {
            System.out.println(artikel.toString());
        }
    }
}