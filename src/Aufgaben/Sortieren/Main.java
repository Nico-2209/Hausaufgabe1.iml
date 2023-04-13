package Aufgaben.Sortieren;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> texte = BeispielListe.erstelleBeispielListe();


        // Sortiere die Texte nach Größe
        Collections.sort(texte, new MainComparator() );

        for (String text : texte) {
            String[] parts = text.split(" ");
            System.out.printf("%-14s %s\n", parts[0], parts[1]);
        }
    }
}