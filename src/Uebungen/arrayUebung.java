package Uebungen;
import java.util.Arrays;

public class arrayUebung {

    public static void main(String[] args) {

        // 1. sort(): Sortiert das Array in aufsteigender Reihenfolge
        int[] array = { 5, 2, 8, 1, 9 };
        java.util.Arrays.sort(array);
        System.out.println("Sortiertes Array: " + Arrays.toString(array));

// 2. length: Gibt die Anzahl der Elemente im Array zurück
        System.out.println("Anzahl der Elemente: " + array.length);

// 3. index: Gibt das Element an der angegebenen Position im Array zurück
        System.out.println("Element an Position 2: " + array[2]);

// 4. add(): Arrays können nicht dynamisch erweitert werden, aber ein neues Array mit einem zusätzlichen Element erstellt werden
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = 17;
        System.out.println("Array mit hinzugefügtem Element: " + Arrays.toString(newArray));

// 5. remove(): Entfernt das Element an der angegebenen Position aus dem Array
// Arrays können nicht dynamisch verkleinert werden, aber ein neues Array mit einem Element weniger erstellt werden
        int[] reducedArray = new int[array.length - 1];
        System.arraycopy(array, 0, reducedArray, 0, 3);
        System.arraycopy(array, 4, reducedArray, 3, array.length - 4);
        System.out.println("Array ohne Element an Position 3: " + Arrays.toString(reducedArray));

// 7. swap(): Tauscht das erste und letzte Element im Array
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        System.out.println("Array mit getauschtem ersten und letzten Element: " + Arrays.toString(array));

// 8. reverse(): Sortiert das Array in umgekehrter Reihenfolge
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - i - 1];
        }
        System.out.println("Array in umgekehrter Reihenfolge: " + Arrays.toString(reversedArray));

// 9. indexOf(): Durchsucht das Array nach leeren Stellen
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                System.out.println("Leere Stelle an Position " + i);
            }
        }
// Schleife, um alle leeren Stellen im Array zu entfernen
        int emptyCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                emptyCount++;
            } else if (emptyCount > 0) {
                array[i - emptyCount] = array[i];
            }
        }
        int[] newArrayWithoutEmpty = new int[array.length - emptyCount];
        System.arraycopy(array, 0, newArrayWithoutEmpty, 0, array.length - emptyCount);
        System.out.println("Array ohne leere Stellen: " + Arrays.toString(newArrayWithoutEmpty));




    }


}
