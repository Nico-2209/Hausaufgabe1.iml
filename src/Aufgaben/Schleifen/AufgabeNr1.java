package Aufgaben.Schleifen;
import java.util.ArrayList;
import java.util.Scanner;

public class AufgabeNr1 {

    //Erstellen Sie ein Programm, das den Anwender in einer Schleife dazu auffordert, einen Namen einzugeben. Fügen Sie diesen in eine Liste ein, die Sie bereits vor dem Beginn der Schleife deklarieren.
    // Fragen Sie den Anwender anschließend, ob er einen weiteren Eintrag vornehmen will. Fordern Sie ihn dabei dazu auf, den Buchstaben j oder n einzugeben. Die Bedingung der Schleife soll diesen Buchsta-ben verwenden.
    // Überlegen Sie sich, welche Art von Schleife hierfür sinnvoll ist. Geben Sie abschließend die Liste zur Überprüfung aus. Hierfür ist es nicht not-wendig, eine weitere Schleife zu verwenden

    public static ArrayList<String> namenEingeben() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> namenListe = new ArrayList<>();

        while (true) {
            System.out.println("Geben Sie einen Namen ein:");
            String name = scanner.nextLine();
            namenListe.add(name);

            System.out.println("Möchten Sie einen weiteren Eintrag vornehmen? (j/n)");
            String antwort = scanner.nextLine();

            if (antwort.equalsIgnoreCase("n")) {
                break;
            }
        }

        return namenListe;
    }

    public static void main(String[] args) {
        ArrayList<String> namenListe = namenEingeben();
        System.out.println("Die eingegebenen Namen sind:");
        for (String name : namenListe) {
            System.out.println(name);
        }
    }

}
