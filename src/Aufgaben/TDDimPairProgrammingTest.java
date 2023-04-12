package Aufgaben;

import org.junit.jupiter.api.Test;

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
        String zeichen = "abc def";
        assertEquals(7, anzahlZeichen(zeichen));
        zeichen = "olla";
        assertEquals(4, anzahlZeichen(zeichen));

        zeichen = "";
        assertEquals(0, anzahlZeichen(zeichen));

        zeichen = " \t\n";
        assertEquals(3, anzahlZeichen(zeichen));

        zeichen = " abc ";
        assertEquals(5, anzahlZeichen(zeichen));

        zeichen = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~";
        assertEquals(95, anzahlZeichen(zeichen));
    }

    @Test
    public void startPosTextTest() {
        assertEquals(startPosText("ein langer Max", "Max"), 11);
        assertEquals(startPosText("Max", "Max"), 0);
        assertEquals(startPosText("ein langer Max", "M"), 11);
        assertEquals(startPosText("ein langer Max", "x"), 13);
        assertEquals(startPosText("ein langer Max", "l"), 4);
        assertEquals(startPosText("ein langer Max", "max"), -1);//-1 wenn wort nicht vorhanden
        assertEquals(startPosText("MaxMaxMax", "Max"), 0);
        assertEquals(startPosText("", "Max"), -1);
        assertEquals(startPosText("Max", ""), 0);
    }

    @Test
    public void textTeil7bis12Test() {
// Test 1: Text mit Länge 16
        String text = "GutenTagWieGehts";
        assertEquals("gWieGe", textTeil7bis12(text));

        // Test 2: Text mit Länge 6
        String text1 = "abcdef";
        // Test, ob eine IndexOutOfBoundsException ausgelöst wird
        assertThrows(IndexOutOfBoundsException.class, () -> textTeil7bis12(text1));

        // Test 3: Text mit Länge 13
        String text2 = "HalloWelt1234";
        assertEquals("lt1234", textTeil7bis12(text2));

        // Test 4: Text mit Länge 7
        String text3 = "1234567";
        // Test, ob eine IndexOutOfBoundsException ausgelöst wird
        assertThrows(IndexOutOfBoundsException.class, () -> textTeil7bis12(text3));

        // Test 5: Text mit Länge 12
        String text4 = "ABCDEFGHIJKL";
        assertThrows(IndexOutOfBoundsException.class, () -> textTeil7bis12(text4));
        ;

        // Test 6: Leerzeichen als Eingabe
        String text5 = " ";
        assertThrows(IndexOutOfBoundsException.class, () -> textTeil7bis12(text5));
        ;

        // Test 7: Leerer Text als Eingabe
        String text6 = "";
        // Test, ob eine IndexOutOfBoundsException ausgelöst wird
        assertThrows(IndexOutOfBoundsException.class, () -> textTeil7bis12(text6));
    }

    @Test
    public void umgedrehterTextTest() {
        // Test 1: Leerer Text
        String text1 = "";
        assertEquals("", umgedrehterText(text1));

        // Test 2: Text mit einem Zeichen
        String text2 = "a";
        assertEquals("a", umgedrehterText(text2));

        // Test 3: Text mit ungerader Anzahl von Zeichen
        String text3 = "12345";
        assertEquals("54321", umgedrehterText(text3));

        // Test 4: Text mit Leerzeichen
        String text4 = "Hallo Welt!";
        assertEquals("!tleW ollaH", umgedrehterText(text4));

        // Test 5: Text mit Sonderzeichen
        String text5 = "#$%&!";
        assertEquals("!&%$#", umgedrehterText(text5));
        //Test6: auf NullPointerTesten
        String text = null;
        assertThrows(NullPointerException.class, () -> umgedrehterText(text));


    }

    @Test
    public void buchstabenSortTest() {
        String text = "dbac";
assertEquals("abcd",buchstabenSort(text).get(0));
assertEquals("dcba",buchstabenSort(text).get(1));
    }

    @Test
    public void anzahlDerWorteTest() {
        String Text = "guten morgen";
        assertEquals(2,anzahlDerWorte(Text));
    }


}




