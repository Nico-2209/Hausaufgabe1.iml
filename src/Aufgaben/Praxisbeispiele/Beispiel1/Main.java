package Aufgaben.Praxisbeispiele.Beispiel1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String eingabe;
        int auswahl;
        int weiter;
        Sortiment sortiment = new Sortiment(){};
        Produkte[] produkte = new Produkte[]{
                new Produkte(1001, "T-Shirt", 15.99, 50),
                new Produkte(1002, "Jeans", 39.99, 30),
                new Produkte(1003, "Sneakers", 79.99, 20),
                new Produkte(1004, "Hoodie", 29.99, 40),
                new Produkte(1005, "Backpack", 49.99, 25),
                new Produkte(1006, "Baseball Cap", 14.99, 60),
                new Produkte(1007, "Jacket", 99.99, 15),
                new Produkte(1008, "Running Shoes", 89.99, 10),
                new Produkte(1009, "Shorts", 24.99, 35),
                new Produkte(1010, "Sunglasses", 19.99, 45),
                new Produkte(1011, "Swim Trunks", 29.99, 30),
                new Produkte(1012, "Dress Shirt", 34.99, 25),
                new Produkte(1013, "Sweatpants", 24.99, 50),
                new Produkte(1014, "Sweatshirt", 29.99, 40),
                new Produkte(1015, "Tennis Shoes", 69.99, 20),
                new Produkte(1016, "Gym Bag", 39.99, 15),
                new Produkte(1017, "Hiking Boots", 119.99, 10),
                new Produkte(1018, "Ski Jacket", 149.99, 5),
                new Produkte(1019, "Snowboard", 299.99, 2),
                new Produkte(1020, "Wetsuit", 99.99, 5),
                new Produkte(1021, "Baseball Glove", 24.99, 30),
                new Produkte(1022, "Basketball", 29.99, 25),
                new Produkte(1023, "Football", 29.99, 25),
                new Produkte(1024, "Golf Clubs", 199.99, 5),
                new Produkte(1025, "Hockey Stick", 49.99, 20),
                new Produkte(1026, "Running Shorts", 19.99, 35),
                new Produkte(1027, "Running Shirt", 24.99, 30),
                new Produkte(1028, "Skateboard", 99.99, 10),
                new Produkte(1029, "Snowboard Boots", 149.99, 5),
                new Produkte(1030, "Soccer Ball", 19.99, 40),
                new Produkte(1031, "Tennis Racket", 79.99, 15),
                new Produkte(1032, "Volleyball", 24.99, 25),
                new Produkte(1033, "Wrestling Shoes", 49.99, 10),
                new Produkte(1034, "Yoga Mat", 29.99, 20),
                new Produkte(1035, "Paddleboard", 399.99, 2),
                new Produkte(1036, "Climbing Shoes", 89.99, 10),
                new Produkte(1037, "Climbing Harness", 69.99, 10)};

        for (Produkte produkt : produkte) {
            sortiment.getArtikelListe().add(produkt);
        }

        System.out.println("Herzlich Willkommen zum Verwaltungsprogramm!\n\n\n");

        while (true) {
            System.out.println("Waehlen Sie eine Aktion aus:\n");
            System.out.println("Wareneingang annehmen: Option 1");
            System.out.println("Verkauf taetigen: Option 2");
            System.out.println("Ein Sonderangebot durchfuehren: Option 3");
            System.out.println("Das Sortiment ausgeben: Option 4\n");
            System.out.print("Geben Sie die Nummer der gewuenschten Aktion ein: ");

            try {
                eingabe = br.readLine();
                auswahl = Integer.parseInt(eingabe);
            } catch(NumberFormatException e) {
                System.out.println("Bitte eine Zahl eingeben!");
                continue;
            }

            switch (auswahl) {
                case 1:
                    sortiment.warenlieferung();
                    break;
                case 2:
                    sortiment.verkaufen();
                    break;
                case 3:
                    sortiment.sonderangebot();
                    break;
                case 4:
                    sortiment.ausgeben();
                    break;
                default:
                    System.out.println("Sie haben eine ungueltige Zahl eingegeben.");
            }

            weiter = JOptionPane.showConfirmDialog(null, "Moechten Sie eine weitere Aktion durchfuehren?", "Bestaetigung", JOptionPane.YES_NO_OPTION);

            if (weiter == 1) {
                break;
            }
        }

        System.out.println("Auf Wiedersehen!");
    }
}