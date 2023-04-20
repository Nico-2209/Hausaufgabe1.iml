package Aufgaben.Generics;

import static Aufgaben.Generics.Methoden.addiere;

public class Main {
    public static void main(String[] args) {

int a = 10;
double b = 10.0;
float c = 10.0f;
        System.out.println(addiere(a));
        System.out.println(addiere(b));
        System.out.println(addiere(c));

        a = (int) addiere(a);

    }
}
