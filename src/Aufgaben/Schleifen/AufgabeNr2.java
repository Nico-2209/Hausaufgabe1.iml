package Aufgaben.Schleifen;

public class AufgabeNr2 {

    //Geben Sie die Zahlen von 20 bis 0 rückwärts in Zweierschritten aus. Verwenden Sie hierfür eine Schleife, die einen möglichst geringen Programmcode erzeugt.
    public static void main(String[] args) {
        for (int zahl = 20; zahl >= 0; zahl -= 2) {
            System.out.println(zahl);
        }
    }

}
