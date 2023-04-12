package Aufgaben.ObjektOrientierung.KomplexereObjektOrientierung.Abstrakt;

// Abstrakte Klasse "Fahrzeug"
public abstract class Fahrzeug {
    protected String hersteller;
    protected String modell;
    protected double geschwindigkeit;

    public Fahrzeug(String hersteller, String modell) {
        this.hersteller = hersteller;
        this.modell = modell;
    }

    public abstract void beschleunigen(double geschwindigkeit);
    public abstract void bremsen(double geschwindigkeit);

    public void drucken() {
        System.out.println("Hersteller: " + this.hersteller + ", Modell: " + this.modell + ", Geschwindigkeit: " + this.geschwindigkeit + " km/h");
    }
}
