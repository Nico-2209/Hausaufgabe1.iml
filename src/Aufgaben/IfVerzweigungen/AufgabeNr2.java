package Aufgaben.IfVerzweigungen;

import java.util.Scanner;

public class AufgabeNr2 {

    //2. Da der Anwender etwas bequem ist, gibt er seinen Namen nicht immer mit ei-nem Großbuchstaben ein.
    // Sorgen Sie dafür, dass das Programm auch die Eingabe „paul“ akzeptiert. Außerdem soll es ein Passwort abfragen.
    // Nur wenn beide Werte stimmen, soll das Programm die Begrüßung ausgeben
    public static boolean namePasswortErfragen() {
        System.out.println("Hallo! geben sie Ihr Namen ein:");
        Scanner sc = new Scanner(System.in);
        String eingabe = sc.nextLine();
        System.out.println("Geben sie ihr Passwort ein!");
        String passwort = sc.nextLine();
        if (eingabe.toLowerCase().equals("paul")&& passwort.equals("123")) {
            System.out.println("Hallo! " + eingabe);
            System.out.println("Zugriff erlaubt...");
            return true;

        } else {
            System.out.println("Zugriff nicht erlaubt!");
            return false;
        }
    }

    public static void main(String[] args) {
        namePasswortErfragen();
    }

}
