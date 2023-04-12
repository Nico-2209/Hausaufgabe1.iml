package Aufgaben.ObjektOrientierung.Grundlagen;

public class Main {

    public static void main(String[] args) {
        Mitarbeiter mitarbeiter = new Mitarbeiter("Mueller", "Hans", 12345, 2000.0);

        System.out.println("Name: " + mitarbeiter.getName());
        System.out.println("Vorname: " + mitarbeiter.getVorname());
        System.out.println("Personalnummer: " + mitarbeiter.getPersonalnummer());
        System.out.println("Monatslohn: " + mitarbeiter.getMonatslohn());

        mitarbeiter.gehaltserhoehung(5.0);

        System.out.println("Neuer Monatslohn: " + mitarbeiter.getMonatslohn());

    }
}
