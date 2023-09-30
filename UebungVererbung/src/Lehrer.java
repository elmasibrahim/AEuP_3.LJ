public class Lehrer extends Person {
    String hauptfach;

    public Lehrer() {}

    public Lehrer(String name, String gebOrt, String gebDat, String hauptfach) {
        super(name, gebOrt, gebDat);
        this.hauptfach = hauptfach;
    }
}
