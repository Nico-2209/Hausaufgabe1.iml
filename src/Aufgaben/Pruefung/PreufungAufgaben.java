package Aufgaben.Pruefung;

import java.util.ArrayList;

import static Aufgaben.Pruefung.Sockenlager.lagerGroesse;
import static Aufgaben.Pruefung.Sockenlager.zeigePlatzInhalt;

public class PreufungAufgaben {
    public static ArrayList<String> lagerBoxHinten(ArrayList<String> lager) {

        ArrayList<Integer> count = new ArrayList<>();
        for (int i = 0; i < lager.size(); i++) {
            if (lager.get(i).contains("Freie Lagerbox")) {
                count.add(i);

            }
        }
        int index;
        for (int i = count.size() -1; i >= 0; i--) {
            index = count.get(i);
            lager.remove(index);
            lager.add("Freie Lagerbox");

        }
        return lager;
    }

    public static void main(String[] args) {
        ArrayList<String> sockenListe = new ArrayList<>();
        for (int i = 0; i < lagerGroesse(); i++) {

          sockenListe.add(i + ":"+zeigePlatzInhalt(i));
        }
        System.out.println(lagerBoxHinten(sockenListe));
    }






}
