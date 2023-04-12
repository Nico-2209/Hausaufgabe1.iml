package Aufgaben.VorgefertigteKlassen.JoptionPane;

import javax.swing.JOptionPane;

public class Ausgaben {
    public static void main(String[] args) {
        // Erstellen des Bestätigungsfensters
        int selectedOption = JOptionPane.showOptionDialog(null, // Parent-Komponente
                "Möchten Sie fortfahren?", // Nachricht
                "Bestätigung", // Titel des Fensters
                JOptionPane.YES_NO_CANCEL_OPTION, // Optionen
                JOptionPane.QUESTION_MESSAGE, // Icon
                null, // Option-Array (null, da Optionen durch YES, NO, CANCEL festgelegt werden)
                new Object[]{"Ja", "Nein", "Abbrechen"}, // Option-Texte
                "Ja" // Standard-Button
        );

        // Verarbeiten des Benutzerinputs
        switch (selectedOption) {
            case JOptionPane.YES_OPTION:
                JOptionPane.showMessageDialog(null, "Sie haben Ja gewählt.");
                break;
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(null, "Sie haben Nein gewählt.");
                break;
            case JOptionPane.CANCEL_OPTION:
                JOptionPane.showMessageDialog(null, "Sie haben Abbrechen gewählt.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Sie haben das Fenster geschlossen, ohne eine Auswahl zu treffen.");
                break;
        }
        // Eingabeaufforderung für eine Zahl
        String input = JOptionPane.showInputDialog("Bitte geben Sie eine Zahl ein:");
        double number = Double.parseDouble(input);

        // Berechnen der Wurzel
        double squareRoot = Math.sqrt(number);

        // Anzeigen der Wurzel in einer Message-Box
        JOptionPane.showMessageDialog(null, "Die Wurzel von " + number + " ist " + squareRoot);


    }
}
