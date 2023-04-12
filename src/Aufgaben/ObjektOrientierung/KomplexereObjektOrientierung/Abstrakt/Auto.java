package Aufgaben.ObjektOrientierung.KomplexereObjektOrientierung.Abstrakt;

// Konkrete Implementierungsklasse "Auto"
public class Auto extends Fahrzeug {

    public Auto(String hersteller, String modell) {
        super(hersteller, modell);
    }

    // Implementierung der abstrakten Methode "beschleunigen" aus der abstrakten Klasse "Fahrzeug"
    @Override
    public void beschleunigen(double geschwindigkeit) {
        this.geschwindigkeit += geschwindigkeit;
        System.out.println("Auto beschleunigt auf " + this.geschwindigkeit + " km/h");
    }

    // Implementierung der abstrakten Methode "bremsen" aus der abstrakten Klasse "Fahrzeug"
    @Override
    public void bremsen(double geschwindigkeit) {
        this.geschwindigkeit -= geschwindigkeit;
        System.out.println("Auto bremst auf " + this.geschwindigkeit + " km/h");
    }
}