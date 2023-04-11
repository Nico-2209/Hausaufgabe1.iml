package Aufgaben.ZsmDatentypen;

import java.util.Arrays;

public class AufgabenNr1 {
//Übungsaufgabe: zusammengesetzte Datentypen verwenden:

//1.Erstellen Sie ein Programm, das ein Array aus sechs String-Variablen erzeugt.
//Die-ses soll die Vornamen der Teilnehmer an einem Sprachkurs enthalten. Geben Sie das gesamte Array sowie den ersten und den letzten Namen der Liste aus.
// Ändern Sie danach einen beliebigen Eintrag und geben Sie das Array erneut aus.

    public static void main(String[] args) {
        String[] stringArray = new String[6];

        stringArray[0] = "Franz Meier";

        stringArray[1] = "Thomas leubner";

        stringArray[2] = "Klaus Peter";

        stringArray[3] = "Sandro Wagner";

        stringArray[4] = "Fritz Fischer";

        stringArray[5] = "Leroy Sane";

        System.out.println(Arrays.toString(stringArray));
        System.out.println("Erster Name: " + stringArray[0]);
        System.out.println("Letzer Name" + stringArray[5]);

        stringArray[1] = "Haaland";

        System.out.println(Arrays.toString(stringArray));

    }






}
