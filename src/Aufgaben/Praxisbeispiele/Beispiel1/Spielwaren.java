package Aufgaben.Praxisbeispiele.Beispiel1;

public class Spielwaren extends Produkte{
    private int mindestalter;
    private int hoechstalter;

    public Spielwaren(int artnr, String typ, double preis, int anzahl, int mindestalter, int hoechstalter) {
        super(artnr, typ, preis, anzahl);
        this.mindestalter = mindestalter;
        this.hoechstalter = hoechstalter;
    }

    public int getMindestalter() {
        return mindestalter;
    }

    public void setMindestalter(int mindestalter) {
        this.mindestalter = mindestalter;
    }

    public int getHoechstalter() {
        return hoechstalter;
    }

    public void setHoechstalter(int hoechstalter) {
        this.hoechstalter = hoechstalter;
    }
}
