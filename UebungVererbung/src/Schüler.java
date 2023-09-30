public class Schüler extends Person {
    String bildungsabschluss;
    float notendurchschnitt;

    public Schüler() {}

    public Schüler(String name, String gebOrt, String gebDat, String bildungsabschluss, float notendurchschnitt) {
        super(name, gebOrt, gebDat);
        this.bildungsabschluss = bildungsabschluss;
        this.notendurchschnitt = notendurchschnitt;
    }
}
