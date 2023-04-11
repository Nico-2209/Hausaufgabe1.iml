package Aufgaben.IfVerzweigungen;

import java.util.Scanner;

public class AufgabeNr3 {
    //Schreiben Sie ein Programm, das vom Anwender eine Zahl zwischen 1 und 12 ab-fragt.
    // Daraufhin soll es den Namen des Monats ausgeben, der bei einer Datumsangabe für den entsprechenden Wert steht.
    // Sie können für die Umsetzung entweder eine Struktur mit else if oder mit switch auswählen

    public static String monatsAbfrage(String eingabe) {
        String monat = null;
        int zahl = Integer.parseInt(eingabe);

        switch (zahl) {
            case 1:
                monat = "Januar";
                break;
            case 2:
                monat = "Februar";
                break;
            case 3:
                monat = "März";
                break;
            case 4:
                monat = "April";
                break;
            case 5:
                monat = "Mai";
                break;
            case 6:
                monat = "Juni";
                break;
            case 7:
                monat = "Juli";
                break;
            case 8:
                monat = "August";
                break;
            case 9:
                monat = "September";
                break;
            case 10:
                monat = "Oktober";
                break;
            case 11:
                monat = "November";
                break;
            case 12:
                monat = "Dezember";
                break;
            default:
                System.out.println("Ungültige Eingabe.");
                break;

        }
        return monat;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String monatsAngabe = sc.nextLine();
        System.out.println(monatsAbfrage(monatsAngabe));
    }

}
