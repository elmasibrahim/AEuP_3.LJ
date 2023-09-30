
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Thomas", "München", "01.01.1000");
        Lehrer lehrer = new Lehrer("Kevin", "Berlin", "01.01.1000", "Deutsch");
        Mitarbeiter mitarbeiter = new Mitarbeiter("Justin", "Köln", "01.01.1000", 123, false, 1500.0);
        Schüler schüler = new Schüler("Christian", "Dortmund", "01.01.1000", "Mittlere Reife", 1.2f);
        Azubi azubi = new Azubi("Benjamin", "Deutschland", "01.01.1000", 123, false, 1500.0, 3);
    }
}