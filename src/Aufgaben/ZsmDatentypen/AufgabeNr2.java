package Aufgaben.ZsmDatentypen;

import java.util.ArrayList;
import java.util.Scanner;

public class AufgabeNr2 {

    //2. Erzeugen Sie eine Liste für die Namen der Mitarbeiter eines Unternehmens.
    // Ge-ben Sie daraufhin dem Anwender die Möglichkeit, fünf Namen in die Liste einzu-tragen und geben Sie abschließend die gesamte Liste aus

    public static ArrayList<String> mitarbeiterListeErstellen() {
        ArrayList<String> mitarbeiterListe = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean abbruch = true;
        System.out.println("Mitarbeiter liste wird erstellt...");
        while (abbruch) {
            System.out.println("Geben sie ein Namen zum hinzufügen ein!");
            System.out.println("Zum abbrechen geben sie (0) ein!");

            String eingabe = sc.nextLine();

            if (eingabe.equals("0")) {
                System.out.println("Erstelle mit arbeiter liste:\n"+ mitarbeiterListe);
                return mitarbeiterListe;
            } else {
                mitarbeiterListe.add(eingabe);
            }

        }


        return mitarbeiterListe;
    }

    public static void main(String[] args) {
        mitarbeiterListeErstellen();
    }

}
