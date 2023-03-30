package Uebungen;

import java.util.ArrayList;

public class Strings {

    public static void main(String[] args) {

//aufgabe 1
//Zerlegt einen Satz in Wörter und speichert sie in einer ArrayList
        String sentence = "Das ist ein Beispiel Satz.";
        String[] words = sentence.split(" ");

        ArrayList<String> wordList = new ArrayList<String>();
        for (String word : words) {
            wordList.add(word);
        }

        System.out.println(wordList);
//aufgabe 2
//Entfernt alle Leerzeichen aus einem String
        String input = " Dies ist ein Satz mit Leerzeichen. ";
        String output = input.replaceAll("\\s", "");
        System.out.println(output); // Ausgabe: "DiesisteinSatzmitLeerzeichen."

//aufgabe 3
//Extrahiert einen Teilstring aus einem Wort
        String word = "Programmieren";
        String prefix = word.substring(0, 3);
        System.out.println(prefix); // Ausgabe: "Pro"

//aufgabe 4
//Ersetzt alle Vorkommen eines Zeichens in einem String durch ein anderes Zeichen
        input = "Dies ist ein Beispiel.";
        output = input.replace("e", "X");
        System.out.println(output); // Ausgabe: "Dis ist ein BXispiXl."

//aufgabe 5
//Überprüft, ob ein String mit einem bestimmten Präfix beginnt
        word = "Hallo, Welt!";
        boolean startsWithHello = word.startsWith("Hallo");
        boolean startsWithWorld = word.startsWith("Welt");
        System.out.println(startsWithHello); // Ausgabe: "true"
        System.out.println(startsWithWorld); // Ausgabe: "false"


//aufgabe 6
//Verbindet zwei Strings zu einem neuen String
        String s1 = "hello";
        String s2 = "world";
        String s3 = s1.concat(s2);
        System.out.println(s3); // Ausgabe: "helloworld"

//aufgabe 7
//Überprüft, ob ein String einen anderen String enthält
        sentence = "Java ist eine objektorientierte Programmiersprache.";
        boolean containsJava = sentence.contains("Java");
        boolean containsPython = sentence.contains("Python");
        System.out.println(containsJava); // Ausgabe: "true"
        System.out.println(containsPython); // Ausgabe: "false"

//aufgabe 8
//Zerlegt einen Namen in Vor- und Nachnamen und gibt sie aus
        String name = "Max Mustermann";
        String[] nameParts = name.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[nameParts.length - 1];
        System.out.println(firstName); // Ausgabe: "Max"
        System.out.println(lastName); // Ausgabe: "Mustermann"

//aufgabe 9
//Summiert Zahlen aus einem String auf
        String s = "1,2,3,4,5";
        String[] numbers = s.split(",");
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        System.out.println(sum); // Ausgabe: "15"

//aufgabe 10
//Entfernt Leerzeichen am Anfang und Ende eines Strings
        s = " Java ist eine objektorientierte Programmiersprache. ";
        String trimmed = s.trim();
        System.out.println(trimmed); // Ausgabe: "Java ist eine objektorientierte Programmiersprache."

    }
}