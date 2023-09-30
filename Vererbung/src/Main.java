// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Uhrzeit uhrzeit = new Uhrzeit(1, 2);
        uhrzeit.ausgabe();

        GenaueUhrzeit genaueUhrzeit = new GenaueUhrzeit(1, 2, 3);
        genaueUhrzeit.ausgabe();
    }
}