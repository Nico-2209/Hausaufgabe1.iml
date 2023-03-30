package Uebungen;

import java.util.ArrayList;
import java.util.Random;

public class Listen {
    /**
     * Berechnet die Summe aller Integer-Elemente in der übergebenen ArrayList.
     *
     * @param list Die ArrayList von Integer-Objekten, deren Summe berechnet werden soll.
     * @return Die Summe aller Elemente in der ArrayList.
     */
    public int sum(ArrayList<Integer> list) {
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
    public ArrayList<String> filter(ArrayList<String> list, char firstLetter) {
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
    public int countGreaterThan(ArrayList<Double> list, double threshold) {
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
    public ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
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
    public ArrayList<String> randomSubset(ArrayList<String> list, int size) {
        ArrayList<String> result = new ArrayList<>();
        Random rand = new Random();
        while (result.size() < size && !list.isEmpty()) {
            int index = rand.nextInt(list.size());
            result.add(list.remove(index));
        }
        return result;
    }

}
