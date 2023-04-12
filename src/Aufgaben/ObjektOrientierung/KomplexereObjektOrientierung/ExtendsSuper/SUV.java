package Aufgaben.ObjektOrientierung.KomplexereObjektOrientierung.ExtendsSuper;

import Aufgaben.ObjektOrientierung.KomplexereObjektOrientierung.ExtendsSuper.Fahrzeug;

public class SUV extends Fahrzeug {
    private boolean allradantrieb;
    private int sitzplaetze;
    private String anhaengerkupplung;

    public SUV(String marke, String modell, int baujahr, int kilometerstand, boolean allradantrieb, int sitzplaetze, String anhaengerkupplung) {
        super(marke, modell, baujahr, kilometerstand);
        this.allradantrieb = allradantrieb;
        this.sitzplaetze = sitzplaetze;
        this.anhaengerkupplung = anhaengerkupplung;
    }

    public boolean isAllradantrieb() {
        return allradantrieb;
    }

    public int getSitzplaetze() {
        return sitzplaetze;
    }

    public String getAnhaengerkupplung() {
        return anhaengerkupplung;
    }

    public void anhaengerKupplungAnhaengen() {
        System.out.println("Anhänger wurde angehängt.");
    }

    public void anhaengerKupplungAbhaengen() {
        System.out.println("Anhänger wurde abgehängt.");
    }
}