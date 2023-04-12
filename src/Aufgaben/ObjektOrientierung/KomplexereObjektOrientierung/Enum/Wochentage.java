package Aufgaben.ObjektOrientierung.KomplexereObjektOrientierung.Enum;

// Hauptprogramm
public class Wochentage {
    public static void main(String[] args) {
        // Definition einer Variablen "aktuellerTag" vom Typ "Tage" mit dem Wert "Mittwoch"
        Tage aktuellerTag = Tage.Mittwoch;

        // Überprüfen, ob der aktuelle Tag ein Wochenendtag ist oder nicht
        if (aktuellerTag.getWochenende()) {
            System.out.println("Geschlossen!"); // Ausgabe: Geschlossen!
        } else {
            System.out.println("Geöffnet!"); // Ausgabe: Geöffnet!
        }
    }
}