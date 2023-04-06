package Aufgaben.Pruefung;

public class Sockenlager{
    private static String[] sockenlager = Sox.sox;
    private final static String PLATZ_EXISTIERT_NICHT = "Dieser Lagerplatz existiert nicht";

    public static String zeigePlatzInhalt(int platzNr){
        if(platzNr<0 || platzNr >= sockenlager.length){
            return PLATZ_EXISTIERT_NICHT;
        }else{
            return sockenlager[platzNr];
        }
    }

    public static int lagerGroesse(){
        return sockenlager.length;
    }

    public static String leereLagerPlatz(int platzNr){
        if(platzNr<0 || platzNr >= sockenlager.length){
            return PLATZ_EXISTIERT_NICHT;
        }else{
            String lagerinhalt = sockenlager[platzNr];
            sockenlager[platzNr] = "Freie Lagerbox";
            return lagerinhalt;
        }
    }

    public static String bestueckeLagerPlatz(String neueSocke, int platzNr){
        if(platzNr<0 || platzNr >= sockenlager.length){
            return PLATZ_EXISTIERT_NICHT;
        }else{
            if("Freie Lagerbox".equals(sockenlager[platzNr])){
                sockenlager[platzNr] = neueSocke;
                return "Platz Nr. "+platzNr+" mit "+neueSocke+" bestückt";
            }else{
                System.out.println("Fehler: Lagerplatz ist nicht leer!");
                return "Fehler: Lagerplatz ist nicht leer!";
            }
        }
    }
}
