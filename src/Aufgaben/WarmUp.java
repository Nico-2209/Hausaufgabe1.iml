package Aufgaben;

public class WarmUp {


    // Methode zur Überprüfung, ob eine Zahl eine Primzahl ist
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Methode zur Berechnung der Quersumme einer Zahl
    public static int getDigitSum(int number) {
        int sum = 0;

        while (number > 0) {
            //Wird durch 10 geteilt Rest wird in sum gespeichert.
            sum += number % 10;
            //num wird durch 10 geteilt, um die letzte Ziffer zu entfernen.
            number /= 10;
        }

        return sum;

    }

    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 100; i++) {
            if (isPrime(i) && isPrime(getDigitSum(i))) {
                count++;
            }
        }

        System.out.println("Fuer " + count + " Zahlen x zwischen 1 und 100 gilt: x ist eine Primzahl und gleichzeitig ist die Quersumme von x ebenfalls eine Primzahl.");
    }

}

