import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Instanziierung
        Rechteck testRechteck = new Rechteck();
        Scanner scanner = new Scanner(System.in);

        //Länge
        System.out.println("Länge: ");
        double laenge = scanner.nextDouble();
        testRechteck.laenge = laenge;

        //Breite
        System.out.println("Breite: ");
        double breite = scanner.nextDouble();
        testRechteck.breite = breite;

        //Fläche berechnen & ausgeben
        testRechteck.flaecheBerechnenAusgeben();
    }
}