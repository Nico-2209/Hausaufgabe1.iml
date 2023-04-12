package Aufgaben.ObjektOrientierung.KomplexereObjektOrientierung.Interfaces;

// Klasse "Auto", die das Interface "Fahrzeug" implementiert
public class Auto implements Fahrzeug {
    private double geschwindigkeit;

    // Implementierung der Methode "beschleunigen" aus dem Interface "Fahrzeug"
    @Override
    public void beschleunigen(double geschwindigkeit) {
        this.geschwindigkeit += geschwindigkeit;
        System.out.println("Auto beschleunigt auf " + this.geschwindigkeit + " km/h");
    }

    // Implementierung der Methode "bremsen" aus dem Interface "Fahrzeug"
    @Override
    public void bremsen(double geschwindigkeit) {
        this.geschwindigkeit -= geschwindigkeit;
        System.out.println("Auto bremst auf " + this.geschwindigkeit + " km/h");
    }
}
