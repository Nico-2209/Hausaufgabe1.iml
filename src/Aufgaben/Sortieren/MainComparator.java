package Aufgaben.Sortieren;
import java.util.Comparator;

// Definiere eine neue Comparator-Klasse für die Sortierung nach Größe
class MainComparator implements Comparator<String> {
    public int compare(String text1, String text2) {
        String[] parts1 = text1.split(" ");
        String[] parts2 = text2.split(" ");
        int size1 = Integer.parseInt(parts1[1]);
        int size2 = Integer.parseInt(parts2[1]);
        if (size1 < size2) {
            return -1;
        } else if (size1 > size2) {
            return 1;
        } else {
            return 0;
        }
    }
}