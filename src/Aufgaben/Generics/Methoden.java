package Aufgaben.Generics;

import java.util.ArrayList;

public class Methoden {

    public static <T> void printList(ArrayList<T> list) {
        for (T item : list) {
            System.out.println(item);

        }

    }

}