package Aufgaben.ZsmDatentypen;// Importiere die Klasse HashSet aus dem Paket java.util

import java.util.ArrayList;
import java.util.HashSet;

import static Aufgaben.ZsmDatentypen.AufgabeNr2.mitarbeiterListeErstellen;

public class Aufgabe3 {
    // Eine Bildungseinrichtung bietet neben einem Java-Kurs noch einen Kurs für die Programmiersprache Python an. Speichern Sie die Teilnehmer jeweils in einer passenden Datenstruktur.
    // Geben Sie daraufhin die Teilnehmer beider Kurse getrennt aus. Außerdem soll eine Liste mit allen Schülern der Bildungseinrichtung dargestellt werden.
    // Die Namen der Teilnehmer, die beide Kurse besuchen, sollen darin nicht doppelt erscheinen.
    // Listen Sie abschließend noch die Kursteilnehmer auf, die beide Bildungsangebote wahrnehmen. Wählen Sie eine Datenstruktur aus, die zu diesen Aufgaben passt.

    public static HashSet<String> doppelteteilnehmer(ArrayList<String> liste1, ArrayList<String> liste2) {
        HashSet<String> doppelteTeilnehmer = new HashSet<>();

        for (String teilnehmer:liste1) {
            if (liste2.contains(teilnehmer)) {
                doppelteTeilnehmer.add(teilnehmer);
            }
        }
      return doppelteTeilnehmer;
    }
    public static void main(String[] args) {
        // Erstelle zwei ArrayLists, um die Teilnehmer des Java-Kurses und des Python-Kurses zu speichern
        ArrayList<String> javaKurs;
        ArrayList<String> pythonKurs;

        // Fülle die ArrayLists mit Teilnehmerdaten, indem die Methode mitarbeiterListeErstellen() aufgerufen wird
        javaKurs = mitarbeiterListeErstellen();
        pythonKurs = mitarbeiterListeErstellen();

        // Gib die Liste der Teilnehmer des Java-Kurses aus
        System.out.println("JavaKurs:\n" + javaKurs);

        // Gib die Liste der Teilnehmer des Python-Kurses aus
        System.out.println("PythonKurs:\n" + pythonKurs);

        // Erstelle ein HashSet, um die Teilnehmer der Bildungseinrichtung zu speichern und Duplikate zu vermeiden
        HashSet<String> bildungseinrichtung = new HashSet<>();

        // Füge alle Teilnehmer des Java-Kurses dem HashSet hinzu
        bildungseinrichtung.addAll(javaKurs);

        // Füge alle Teilnehmer des Python-Kurses dem HashSet hinzu
        bildungseinrichtung.addAll(pythonKurs);

        // Gib das HashSet mit allen Teilnehmern der Bildungseinrichtung aus
        System.out.println(bildungseinrichtung);

        System.out.println(doppelteteilnehmer(javaKurs,pythonKurs));
    }
}