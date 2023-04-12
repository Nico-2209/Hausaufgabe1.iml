package Aufgaben.ObjektOrientierung.KomplexereObjektOrientierung.ExtendsSuper;

public class Fahrzeug {
    private String marke;
    private String modell;
    private int baujahr;
    private int kilometerstand;

    public Fahrzeug(String marke, String modell, int baujahr, int kilometerstand) {
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.kilometerstand = kilometerstand;
    }

    public void fahren(int kilometer) {
        kilometerstand += kilometer;
        System.out.println("Das Fahrzeug wurde um " + kilometer + " km bewegt.");
    }

    public String getMarke() {
        return marke;
    }

    public String getModell() {
        return modell;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public int getKilometerstand() {
        return kilometerstand;
    }
}
