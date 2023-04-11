package Aufgaben.IfVerzweigungen;

import java.util.Scanner;

public class AufgabeNr1 {

    //1. Schreiben Sie ein Programm, das den Anwender nach seinem Namen fragt.
    // Geben Sie eine Begrüßung aus, wenn dieser den Namen „Paul“ eingibt.
    // In allen anderen Fällen soll eine Nachricht erscheinen, dass der Zugriff nicht erlaubt ist.
    public static void nameErfragen() {
        System.out.println("Hallo! geben sie Ihr Namen ein:");
        Scanner sc = new Scanner(System.in);
        String eingabe = sc.nextLine();
        if (eingabe.equals("Paul")) {
            System.out.println("Hallo! " + eingabe);
            System.out.println("Zugriff erlaubt...");
        } else {
            System.out.println("Zugriff nicht erlaubt!");
        }
    }

    public static void main(String[] args) {
        nameErfragen();
    }


}




