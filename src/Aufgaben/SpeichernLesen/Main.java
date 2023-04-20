package Aufgaben.SpeichernLesen;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void eingabeSpeicher(File file) {
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            boolean addMore = true;
            while (addMore) {
                String note = JOptionPane.showInputDialog("Geben Sie eine Notiz ein:");
                bufferedWriter.write(note);
                bufferedWriter.newLine();
                int choice = JOptionPane.showConfirmDialog(null, "Möchten Sie weitere Notizen hinzufügen?", "Notiz hinzufügen", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.NO_OPTION) {
                    addMore = false;
                }
            }

            bufferedWriter.close();
            fileWriter.close();
            JOptionPane.showMessageDialog(null, "Notizen erfolgreich gespeichert!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Fehler beim Schreiben der Datei.");
            e.printStackTrace();
        }
    }

    public static void dateiAusgeben(File file) {
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            ArrayList<String> liste = new ArrayList<>();
            String linie;
            while ((linie = bufferedReader.readLine()) != null) {
                liste.add(linie);
            }
            bufferedReader.close();
            fileReader.close();
            StringBuilder output = new StringBuilder();
            for (int i = 0; i < liste.size(); i++) {
                output.append((i + 1)).append(": ").append(liste.get(i)).append("\n");
            }
            JOptionPane.showMessageDialog(null, output.toString(), "Notizen anzeigen", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ioException) {
            JOptionPane.showMessageDialog(null, "Datei wurde nicht gefunden!");
            ioException.printStackTrace();
        }
    }

    public static void loescheNotiz(File file) {
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            ArrayList<String> notizen = new ArrayList<>();
            String linie;
            while ((linie = bufferedReader.readLine()) != null) {
                notizen.add(linie);
            }
            bufferedReader.close();
            fileReader.close();

            StringBuilder options = new StringBuilder();
            for (int i = 0; i < notizen.size(); i++) {
                options.append((i + 1)).append(": ").append(notizen.get(i)).append("\n");
            }
            String eingabe = JOptionPane.showInputDialog(null, "Wählen Sie die Notizen aus, die Sie löschen möchten, getrennt durch Kommas:\n" + options);
            String[] auswahl = eingabe.split(",");

            //Durch das Sortieren in umgekehrter Reihenfolge stellen wir sicher, dass die zu löschenden Notizen in der richtigen
            //Reihenfolge und mit den richtigen Indizes aus der Liste entfernt werden können.
            Arrays.sort(auswahl, Collections.reverseOrder()); // Rückwärts sortieren, damit keine ungültigen Indizes entstehen
            for (String s : auswahl) {
                int index = Integer.parseInt(s.trim()) - 1;
                notizen.remove(index);
            }

            FileWriter fileWriter = new FileWriter(file, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String notiz : notizen) {
                bufferedWriter.write(notiz);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

            JOptionPane.showMessageDialog(null, "Notizen erfolgreich gelöscht!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Fehler beim Schreiben der Datei.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        File file = new File("src/Aufgaben/SpeichernLesen/Daten");
        eingabeSpeicher(file);
        dateiAusgeben(file);
        loescheNotiz(file);
    }
}