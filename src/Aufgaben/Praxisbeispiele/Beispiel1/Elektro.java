package Aufgaben.Praxisbeispiele.Beispiel1;

public class Elektro extends Produkte{
    private char effizienz;
    private int verbrauch;

    public Elektro(int artnr, String typ, double preis, int anzahl, char effizienz, int verbrauch) {
        super(artnr, typ, preis, anzahl);
        this.effizienz = effizienz;
        this.verbrauch = verbrauch;
    }

    public char getEffizienz() {
        return effizienz;
    }

    public void setEffizienz(char effizienz) {
        this.effizienz = effizienz;
    }

    public int getVerbrauch() {
        return verbrauch;
    }

    public void setVerbrauch(int verbrauch) {
        this.verbrauch = verbrauch;
    }
}
