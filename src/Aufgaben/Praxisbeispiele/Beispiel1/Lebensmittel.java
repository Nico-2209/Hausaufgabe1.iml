package Aufgaben.Praxisbeispiele.Beispiel1;

public class Lebensmittel extends Produkte {
private boolean kuehlung;

    public Lebensmittel(int artnr, String typ, double preis, int anzahl, boolean kuehlung) {
        super(artnr, typ, preis, anzahl);
        this.kuehlung = kuehlung;
    }

    public boolean isKuehlung() {
        return kuehlung;
    }

    public void setKuehlung(boolean kuehlung) {
        this.kuehlung = kuehlung;
    }
}
