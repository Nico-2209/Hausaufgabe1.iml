package Aufgaben.Sortieren;

import java.util.ArrayList;

class BeispielListe {
    public static ArrayList<String> erstelleBeispielListe() {
        String text1 = "sockenRot 60";
        String text2 = "sockenBlau 20";
        String text3 = "sockenBlau 30";
        String text4 = "sockenGelb 10";
        String text5 = "sockenGrün 50";
        String text6 = "sockenRot 30";
        String text7 = "sockenSchwarz 40";
        String text8 = "sockenBlau 40";
        String text9 = "sockenGrün 20";
        ArrayList<String> texte = new ArrayList<>();
        texte.add(text1);
        texte.add(text2);
        texte.add(text3);
        texte.add(text4);
        texte.add(text5);
        texte.add(text6);
        texte.add(text7);
        texte.add(text8);
        texte.add(text9);
        return texte;
    }
}