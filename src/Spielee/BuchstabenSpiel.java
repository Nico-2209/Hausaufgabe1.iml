package Spielee;

import java.util.Random;
import java.util.Scanner;

public class BuchstabenSpiel {

    private static final int DURATION = 10; // Spielzeit in Sekunden
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // Mögliche Buchstaben

    public static void main(String[] args) {
        startGame();
    }

    private static void startGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        long endTime = System.currentTimeMillis() + (DURATION * 1000); // Endzeitpunkt berechnen

        while (System.currentTimeMillis() < endTime) {
            char c = CHARACTERS.charAt(random.nextInt(CHARACTERS.length())); // Zufälligen Buchstaben generieren
            System.out.print(c + " > ");
            String input = scanner.nextLine().toUpperCase(); // Benutzereingabe einlesen und in Großbuchstaben umwandeln
            if (input.length() > 0 && input.charAt(0) == c) { // Prüfen, ob der erste Buchstabe der richtige ist
                score++;
                System.out.println("Richtig! Aktueller Score: " + score);
            } else {
                System.out.println("Falsch!");
            }
        }

        System.out.println("Zeit ist abgelaufen! Endscore: " + score);
    }
}