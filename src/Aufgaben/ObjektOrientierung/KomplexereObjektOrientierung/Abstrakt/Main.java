package Aufgaben.ObjektOrientierung.KomplexereObjektOrientierung.Abstrakt;

public class Main {
    public static void main(String[] args) {
// Erstellen eines Auto-Objekts
        Auto auto = new Auto("BMW", "X5");
// Beschleunigen des Autos um 50 km/h
        auto.beschleunigen(50);

// Bremsen des Autos um 20 km/h
        auto.bremsen(20);

// Drucken der Eigenschaften des Autos auf der Konsole
        auto.drucken();
    }
}
