package Aufgaben.ObjektOrientierung.KomplexereObjektOrientierung.Polymorphie;
/*In diesem Beispiel gibt es eine Klasse Vehicle, von der die Klassen Car und Motorcycle abgeleitet sind.
Die Klasse Main erstellt zwei Objekte, vehicle1 und vehicle2, die als Vehicle deklariert sind, aber tatsächlich Instanzen der abgeleiteten Klassen Car und Motorcycle sind.

Wenn die Methode drive() aufgerufen wird, wird die spezifische Implementierung der abgeleiteten Klasse ausgeführt.

Das heißt, wenn vehicle1.drive() aufgerufen wird, wird die Methode drive() der Klasse Car ausgeführt und "Fahre auf der Autobahn" wird ausgegeben. Wenn vehicle2.drive() aufgerufen wird,
wird die Methode drive() der Klasse Motorcycle ausgeführt und "Fahre auf der Landstraße" wird ausgegeben.

Das ist ein Beispiel für Polymorphie in der objektorientierten Programmierung, da die beiden Objekte, obwohl sie als Vehicle deklariert sind, unterschiedliche Implementierungen der Methode drive() haben,
je nachdem, welche abgeleitete Klasse sie tatsächlich sind.*/

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car(); // Objekt vom Typ Car, das als Vehicle deklariert ist
        Vehicle vehicle2 = new Motorcycle(); // Objekt vom Typ Motorcycle, das als Vehicle deklariert ist

        vehicle1.drive(); // Aufruf der Methode drive() des Objekts vehicle1
        vehicle2.drive(); // Aufruf der Methode drive() des Objekts vehicle2
    }
}