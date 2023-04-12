package Aufgaben.Schleifen;

import java.util.HashMap;
import java.util.Map;

/*
Erstellen Sie eine Map, die das Alter Ihrer Freunde enthält.
Der Schlüssel-begriff soll dabei jeweils der Name sein. Geben Sie diese daraufhin mit einer enhanced for-loop aus.
Wenn wir diese Art von Schleife auf eine Map anwenden, müssen wir als Datentyp für die entsprechende Variable Map.
Entry<Typ1, Typ2> verwenden – wobei Typ1 und Typ2 den Datentypen der Map entsprechen. Die Map selbst können wir nicht direkt einfügen.
Hier-für müssen wir die entrySet()-Methode auf sie anwenden.
Wenn wir die Map freunde nennen, muss daher die Klammer für die for-Schleife so aussehen: (Map.Entry<String, Integer> name: freunde.entrySet()
*/
public class AufgabeNr3 {
    public static void main(String[] args) {
        Map<String,Integer> freundesListe = new HashMap<>();

        freundesListe.put("Nico",22);
        freundesListe.put("Mueller",20);
        freundesListe.put("Flo",18);
        freundesListe.put("Max",16);

        for (Map.Entry<String, Integer> name : freundesListe.entrySet()) {
            System.out.println(name);
        }

    }

}
