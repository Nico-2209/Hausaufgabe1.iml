package Aufgaben;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static Aufgaben.TDDimPairProgramming.*;
import static org.junit.jupiter.api.Assertions.*;

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
public class TDDimPairProgrammingTest {

    @Test
    public void anzahlZeichenTest() {
        assertEquals(7, anzahlZeichen("abc def"));
        assertEquals(4, anzahlZeichen("olla"));
        assertEquals(0, anzahlZeichen(""));
        assertEquals(3, anzahlZeichen(" \t\n"));
        assertEquals(5, anzahlZeichen(" abc "));
        assertEquals(95, anzahlZeichen(" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~"));

    }

    @Test
    public void startPosTextTest() {
        assertEquals(11, startPosText("ein langer Max", "Max"));
        assertEquals(0, startPosText("Max", "Max"));
        assertEquals(11, startPosText("ein langer Max", "M"));
        assertEquals(13, startPosText("ein langer Max", "x"));
        assertEquals(4, startPosText("ein langer Max", "l"));
        assertEquals(-1, startPosText("ein langer Max", "max")); // -1 wenn Wort nicht vorhanden
        assertEquals(-1, startPosText("", "Max"));
        assertEquals(0, startPosText("Max", ""));
    }

    @Test
    public void textTeil7bis12Test() {
        assertEquals("gWieGe", textTeil7bis12("GutenTagWieGehts"));
        assertThrows(IndexOutOfBoundsException.class, () -> textTeil7bis12("abcdef"));
        assertEquals("lt1234", textTeil7bis12("HalloWelt1234"));
        assertThrows(IndexOutOfBoundsException.class, () -> textTeil7bis12("1234567"));
        assertThrows(IndexOutOfBoundsException.class, () -> textTeil7bis12("ABCDEFGHIJKL"));
        assertThrows(IndexOutOfBoundsException.class, () -> textTeil7bis12(" "));
        assertThrows(IndexOutOfBoundsException.class, () -> textTeil7bis12(""));

    }

    @Test
    public void umgedrehterTextTest() {
        assertEquals("", umgedrehterText(""));
        assertEquals("a", umgedrehterText("a"));
        assertEquals("54321", umgedrehterText("12345"));
        assertEquals("!tleW ollaH", umgedrehterText("Hallo Welt!"));
        assertEquals("!&%$#", umgedrehterText("#$%&!"));
        assertThrows(NullPointerException.class, () -> umgedrehterText(null));

    }

    @Test
    public void buchstabenSortTest() {
        assertEquals("abcd", buchstabenSort("dbac").get(0));
        assertEquals("dcba", buchstabenSort("dbac").get(1));
    }

    @Test
    public void anzahlDerWorteTest() {
        assertEquals(4, anzahlDerWorte("Die Anzahl der Worte"));
        assertEquals(2, anzahlDerWorte("Die\nAnzahl\nder Worte"));
        assertEquals(2, anzahlDerWorte("Die.Anzahl\nder Worte"));
        assertEquals(2, anzahlDerWorte(" \t\n"));
        assertEquals(1, anzahlDerWorte("abc"));
        assertEquals(1, anzahlDerWorte(""));
        assertThrows(NullPointerException.class, () -> anzahlDerWorte(null));

    }

    @Test
    public void BuchstabenHäufigkeitTest() {
        String text = "Hello World";
        HashMap<Character, Integer> erwarteteErgebnisse = new HashMap<>();

        erwarteteErgebnisse.put('H', 1);
        erwarteteErgebnisse.put('e', 1);
        erwarteteErgebnisse.put('l', 3);
        erwarteteErgebnisse.put('o', 2);
        erwarteteErgebnisse.put(' ', 1);
        erwarteteErgebnisse.put('W', 1);
        erwarteteErgebnisse.put('r', 1);
        erwarteteErgebnisse.put('d', 1);

        HashMap<Character, Integer> ergebnis = buchstabenHäufigkeit(text);

        assertEquals(erwarteteErgebnisse, ergebnis);
    }


}




