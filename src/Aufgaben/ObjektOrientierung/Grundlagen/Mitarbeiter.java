package Aufgaben.ObjektOrientierung.Grundlagen;

public class Mitarbeiter {
    private String name;
    private String vorname;
    private int personalnummer;
    private double monatslohn;

    public Mitarbeiter(String name, String vorname, int personalnummer, double monatslohn) {
        this.name = name;
        this.vorname = vorname;
        this.personalnummer = personalnummer;
        this.monatslohn = monatslohn;
    }

    public void gehaltserhoehung(double prozent) {
        this.monatslohn += this.monatslohn * prozent / 100;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public int getPersonalnummer() {
        return personalnummer;
    }

    public double getMonatslohn() {
        return monatslohn;
    }
}