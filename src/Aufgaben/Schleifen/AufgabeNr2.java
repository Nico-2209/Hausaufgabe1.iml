package Aufgaben.Schleifen;

public class AufgabeNr2 {

    //Geben Sie die Zahlen von 20 bis 0 rückwärts in Zweierschritten aus. Verwenden Sie hierfür eine Schleife, die einen möglichst geringen Programmcode erzeugt.
    public static void main(String[] args) {
        int zahl = 20;
        for (int i = 0; i <= 10; i++) {
            System.out.println(zahl);
            zahl-=2;


        }
    }

}
