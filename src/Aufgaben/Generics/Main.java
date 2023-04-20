package Aufgaben.Generics;

import java.util.ArrayList;

public  class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
Methoden.printList(list);
ArrayList<Integer> list2 = new ArrayList<>();
list2.add(1);
list2.add(2);
list2.add(3);
list2.add(4);
list2.add(5);
Methoden.printList(list2);

    }
}
