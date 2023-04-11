package Aufgaben.Pruefung;

import java.util.Arrays;
import java.util.Comparator;

public class Main {


    public static int ersteFreieLagerbox(String array[]) {

        for (int i = 0; i < array.length; i++) {

            if (array[i].contains("Freie Lagerbox")) {
                return i;
            }

        }
        return -1;
    }



    public static void main(String[] args) {
        String neuerLager[] = new String[Sockenlager.lagerGroesse()];
        for (int i = 0; i < Sockenlager.lagerGroesse(); i++) {

            neuerLager[i] = Sockenlager.zeigePlatzInhalt(i);
        }

        System.out.println(Arrays.toString(neuerLager));

        System.out.println(ersteFreieLagerbox(neuerLager));

    }





}
