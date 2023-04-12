package Aufgaben.ObjektOrientierung.KomplexereObjektOrientierung.ExtendsSuper;

public class Main {
    public static void main(String[] args) {
        Fahrzeug fahrzeug = new Fahrzeug("Audi", "A4", 2015, 50000);
        System.out.println("Das Fahrzeug hat folgende Eigenschaften:");
        System.out.println("Marke: " + fahrzeug.getMarke());
        System.out.println("Modell: " + fahrzeug.getModell());
        System.out.println("Baujahr: " + fahrzeug.getBaujahr());
        System.out.println("Kilometerstand: " + fahrzeug.getKilometerstand());

        SUV suv = new SUV("BMW", "X5", 2021, 10000, true, 5, "abnehmbar");
        System.out.println("Das SUV hat folgende Eigenschaften:");
        System.out.println("Marke: " + suv.getMarke());
        System.out.println("Modell: " + suv.getModell());
        System.out.println("Baujahr: " + suv.getBaujahr());
        System.out.println("Kilometerstand: " + suv.getKilometerstand());
        System.out.println("Allradantrieb: " + suv.isAllradantrieb());
        System.out.println("Sitzplätze: " + suv.getSitzplaetze());
        System.out.println("Anhängerkupplung: " + suv.getAnhaengerkupplung());

        suv.anhaengerKupplungAnhaengen();
        suv.fahren(500);
        System.out.println("Neuer Kilometerstand: " + suv.getKilometerstand());
        suv.anhaengerKupplungAbhaengen();
    }
}
