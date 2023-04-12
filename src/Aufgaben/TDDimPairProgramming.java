package Aufgaben;

import java.util.ArrayList;
import java.util.Arrays;

public class TDDimPairProgramming {
    public static int anzahlZeichen(String text) {
        return text.length();
    }

    public static int startPosText(String string, String suche) {
        return string.indexOf(suche);

    }

    public static String textTeil7bis12(String text) {

        return text.substring(7, 13);
    }

    public static String umgedrehterText(String text) {
        StringBuilder sb = new StringBuilder(text);
        return sb.reverse().toString();
    }

    public static ArrayList<String> buchstabenSort(String text) {
        ArrayList<String> sortierteBuchstaben = new ArrayList<>();
        char[] textArray = text.toCharArray();
        Arrays.sort(textArray);
        text = String.valueOf(textArray);

         sortierteBuchstaben.add(text);
         sortierteBuchstaben.add(umgedrehterText(text))  ;
         return sortierteBuchstaben;
    }

    public static int anzahlDerWorte(String text) {
        return text.split(" ").length;
    }

    public static void main(String[] args) {
        String Text = "abcdfdghjklewrzüopizurhfgjlkbnvadsfjqr";
        System.out.println(Text.indexOf("G"));
        System.out.println(Text.charAt(5));

        System.out.println(buchstabenSort(Text).toString());
    }
}
