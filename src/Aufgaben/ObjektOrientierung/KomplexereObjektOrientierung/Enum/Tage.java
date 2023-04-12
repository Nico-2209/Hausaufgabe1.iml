package Aufgaben.ObjektOrientierung.KomplexereObjektOrientierung.Enum;
/*
* Enums sind nützlich, wenn eine Variable nur bestimmte vordefinierte Werte annehmen kann und diese Werte klar und prägnant benannt werden sollen,
* um den Code lesbarer und verständlicher zu machen.*/


// Definition der Enumeration "Tage"
enum Tage {
    Montag(false), Dienstag(false), Mittwoch(false), Donnerstag(false),
    Freitag(false), Samstag(true), Sonntag(true);

    // Privates Feld, das angibt, ob der Tag ein Wochenendtag ist oder nicht
    private boolean wochenende;

    // Konstruktor, der das Feld "wochenende" für jeden Wochentag initialisiert
    Tage(final boolean wochenende) {
        this.wochenende = wochenende;
    }

    // Öffentliche Methode, um den Boolean-Wert "wochenende" abzurufen
    public boolean getWochenende() {
        return this.wochenende;
    }
}