package Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{

    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("Apfel");
        liste.add("Banane");
        liste.add("Orange");
        liste.add("Pfirsich");
        liste.add("Kiwi");

        System.out.println("Liste vor dem Umdrehen: " + liste);

        Collections.reverse(liste);

        System.out.println("Liste nach dem Umdrehen: " + liste);

        String element = "Orange";
        while (liste.contains(element)) {
            liste.remove(element);
        }

        System.out.println("Liste nach dem Entfernen von '" + element + "': " + liste);

        liste.add("Orange");

            System.out.println("Liste vor dem Umdrehen: " + liste);

            // keine Umkehrung der Liste durchgeführt
            //Collections.reverse(liste);

            element = "Orange";
            while (liste.contains(element)) {
                liste.remove(element);
            }

            System.out.println("Liste nach dem Entfernen von '" + element + "': " + liste);
        }


}





