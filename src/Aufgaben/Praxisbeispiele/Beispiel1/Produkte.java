package Aufgaben.Praxisbeispiele.Beispiel1;

public class Produkte {
    private int artnr;
    private String produktbezeichnung;
    private double preis;
    private int anzahl;

    public Produkte(int artnr, String typ, double preis, int anzahl) {
        this.artnr = artnr;
        this.produktbezeichnung = typ;
        this.preis = preis;
        this.anzahl = anzahl;
    }

    public void wareneingang(int anzahl) {
        this.anzahl += anzahl;
    }

    public boolean warenausgang(int anzahl) {
        if (this.anzahl >= anzahl) {
            this.anzahl -= anzahl;
            return true;
        } else {
            return false;
        }
    }

    public int getArtnr() {
        return artnr;
    }

    public void setArtnr(int artnr) {
        this.artnr = artnr;
    }

    public String getProduktbezeichnung() {
        return produktbezeichnung;
    }

    public void setProduktbezeichnung(String produktbezeichnung) {
        this.produktbezeichnung = produktbezeichnung;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    @Override
    public String toString() {
        return "Produkte{" +
                "artnr=" + artnr +
                ", produktbezeichnung='" + produktbezeichnung + '\'' +
                ", preis=" + preis +
                ", anzahl=" + anzahl +
                '}';
    }
}


