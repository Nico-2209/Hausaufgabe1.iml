package Aufgaben.Generics;

public class Methoden {

    public static <Type extends Number> Number addiere(Type variable) {

        Number variable1 = variable.intValue() + 2;

        return variable1;
    }

}