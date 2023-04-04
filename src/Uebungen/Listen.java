package Uebungen;

import java.util.*;

public class Listen {



    /**
     * Berechnet die Summe aller Integer-Elemente in der übergebenen ArrayList.
     *
     * @param list Die ArrayList von Integer-Objekten, deren Summe berechnet werden soll.
     * @return Die Summe aller Elemente in der ArrayList.
     */
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }


    /**
     * Filtert alle String-Objekte aus der übergebenen ArrayList heraus, deren erster Buchstabe dem angegebenen Buchstaben entspricht.
     *
     * @param list Die ArrayList von String-Objekten, die gefiltert werden soll.
     * @param firstLetter Der Buchstabe, mit dem die Elemente gefiltert werden sollen.
     * @return Eine neue ArrayList von String-Objekten, die nur die Elemente enthält, die dem Filter entsprechen.
     */
    public static ArrayList<String> filter(ArrayList<String> list, char firstLetter) {
        ArrayList<String> result = new ArrayList<>();
        for (String s : list) {
            if (s.charAt(0) == firstLetter) {
                result.add(s);
            }
        }
        return result;
    }

    /**
     * Zählt die Anzahl aller Double-Objekte in der übergebenen ArrayList, die größer als der angegebene Schwellenwert sind.
     *
     * @param list Die ArrayList von Double-Objekten, die gezählt werden soll.
     * @param threshold Der Schwellenwert, den die Elemente in der ArrayList überschreiten müssen, um gezählt zu werden.
     * @return Die Anzahl der Elemente in der ArrayList, die größer als der Schwellenwert sind.
     */
    public static int countGreaterThan(ArrayList<Double> list, double threshold) {
        int count = 0;
        for (double d : list) {
            if (d > threshold) {
                count++;
            }
        }
        return count;
    }


    /**
     * Entfernt alle Duplikate aus der übergebenen ArrayList von Integer-Objekten und gibt eine neue ArrayList mit den einzigartigen Elementen zurück.
     *
     * @param list Die ArrayList von Integer-Objekten, aus der die Duplikate entfernt werden sollen.
     * @return Eine neue ArrayList von Integer-Objekten, die nur die einzigartigen Elemente enthält.
     */
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i : list) {
            if (!result.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

    /**
     * Erstellt eine zufällige Teilmenge der übergebenen ArrayList von String-Objekten mit der angegebenen Größe.
     *
     * @param list Die ArrayList von String-Objekten, aus der die Teilmenge erstellt werden soll.
     * @param size Die Größe der zufälligen Teilmenge, die erstellt werden soll.
     * @return Eine neue ArrayList von String-Objekten, die eine zufällige Teilmenge der ursprünglichen ArrayList enthält.
     */
    public static ArrayList<String> randomSubset(ArrayList<String> list, int size) {
        ArrayList<String> result = new ArrayList<>();
        Random rand = new Random();
        while (result.size() < size && !list.isEmpty()) {
            int index = rand.nextInt(list.size());
            result.add(list.remove(index));
        }
        return result;
    }


    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        list.add("Guten");
        list.add("Tag");
        list.add("Wie");
        list.add("gehts");
        list.add("Ali");


        System.out.println(randomSubset(list,21));

        //------------------------------------------------
        // Beispiel für die Verwendung von 5 häufig verwendeten Methoden

        // Beispiel-ArrayList mit einigen Integer-Objekten
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(5);
        liste.add(8);
        liste.add(3);
        liste.add(12);
        liste.add(9);

        // 1. sort(): Sortiert die ArrayList in aufsteigender Reihenfolge
        Collections.sort(liste);
        System.out.println("Sortierte Liste: " + liste);

        // 2. size(): Gibt die Anzahl der Elemente in der ArrayList zurück
        System.out.println("Anzahl der Elemente: " + liste.size());

        // 3. get(): Gibt das Element an der angegebenen Position in der ArrayList zurück
        System.out.println("Element an Position 2: " + liste.get(2));

        // 4. add(): Fügt ein Element am Ende der ArrayList hinzu
        liste.add(17);
        System.out.println("Liste mit hinzugefügtem Element: " + liste);

        // 5. remove(): Entfernt das Element an der angegebenen Position aus der ArrayList
        liste.remove(3);
        System.out.println("Liste ohne Element an Position 3: " + liste);


        // 7. swap(): Tauscht das erste und letzte Element in der Liste
        Collections.swap(liste, 0, liste.size() - 1);
        System.out.println("Liste mit getauschtem ersten und letzten Element: " + liste);

        // 8. reverse(): Sortiert die Liste in umgekehrter Reihenfolge
        Collections.reverse(liste);
        System.out.println("Liste in umgekehrter Reihenfolge: " + liste);

        // 9. indexOf(): Sucht alle leeren Stellen in der Liste
        for (int i = 0; i < liste.size(); i++) {
            if (liste.indexOf(i) == -1) {
                System.out.println("Leere Stelle an Position " + i);
            }
        }
        // Schleife, um alle leeren Stellen in der Liste zu entfernen
        for (int i = liste.size() - 1; i >= 0; i--) {
            if (liste.get(i) == null) {
                liste.remove(i);
            }
        }
        System.out.println("Liste ohne leere Stellen: " + liste);



    }

}
