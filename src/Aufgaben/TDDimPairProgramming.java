package Aufgaben;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*Es soll eine Klasse erstellt werden, die eine Reihe von statischen Methoden
enthält, die jeweils einen Text übergeben bekommen und unterschiedliche
Dinge zurückgeben:
a. die Anzahl Zeichen im Text
b. die Startposition eines separat als Parameter übergebenen Suchtexts
c. der Textteil zwischen den Positionen 7 und 12
d. der umgedrehte Text
e. die Buchstaben des Texts auf- und absteigend sortiert
f. die Anzahl der Worte in dem Text
g. eine HashMap <Character, int>1, die für jeden Buchstaben seine
Häufigkeit angibt*/
public class TDDimPairProgramming {
    public static int anzahlZeichen(String text) {
        if (text == null) {
            return -1;
        } else {
            return text.length();
        }

    }

    public static int startPosText(String text, String suche) {
        if (text == null || suche == null) {
            return -1;
        } else {
            return text.indexOf(suche);
        }

    }

    public static String textTeil7bis12(String text) {
        if (text == null) {
            return "Eingabe darf nicht leer sein";
        } else {
            return text.substring(7, 13);
        }
    }

    public static String umgedrehterText(String text) {
        if (text == null) {
            return "Eingabe darf nicht leer sein";
        } else {
            StringBuilder sb = new StringBuilder(text);
            return sb.reverse().toString();
        }

    }

    public static ArrayList<String> buchstabenSort(String text) {
        ArrayList<String> sortierteBuchstaben = new ArrayList<>();
        if (text == null) {
            return null;
        } else {
            char[] textArray = text.toCharArray();
            Arrays.sort(textArray);
            text = String.valueOf(textArray);

            sortierteBuchstaben.add(text);
            sortierteBuchstaben.add(umgedrehterText(text));
            return sortierteBuchstaben;

        }

    }

    public static int anzahlDerWorte(String text) {

        return text.split(" ").length;
    }

    public static HashMap<Character, Integer> buchstabenHäufigkeit(String text) {
        HashMap<Character, Integer> buchstaben = new HashMap<>();
        char[] charArray = text.toCharArray();
        for (char buchstabe : charArray) {
            if (buchstaben.containsKey(buchstabe)) {
                buchstaben.put(buchstabe, buchstaben.get(buchstabe) + 1);
            } else {
                buchstaben.put(buchstabe, 1);
            }

        }
        return buchstaben;
    }

    public static void main(String[] args) {
        String Text = "abcdfdghjklewrzüopizurhfgjlkbnvadsfjqr";
        System.out.println(Text.indexOf("g"));
        System.out.println(Text.charAt(5));

        System.out.println(buchstabenSort(Text).toString());

        System.out.println("---------------------------HashmapAufgabe---------------------------");
        HashMap<String, Integer> vorwahl = new HashMap<>();
        vorwahl.put("München", 30);
        vorwahl.put("Dortmund", 20);
        vorwahl.put("Berlin", 10);

        System.out.println(vorwahl);
        System.out.println("Vorwahl München: " + vorwahl.get("München"));
        System.out.println(vorwahl.containsValue(20));
        System.out.println(vorwahl.containsKey("Berlin"));


        System.out.println(anzahlZeichen(null));
    }
}
