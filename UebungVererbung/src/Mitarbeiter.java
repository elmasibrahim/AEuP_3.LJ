public class Mitarbeiter extends Person {

    //Variablen Initialisiern
    int personalNummer;
    boolean fuehrungskraft;
    double gehalt;

    // Standardkonstruktor
    public Mitarbeiter() {}

    // Zweiter Konstruktor
    public Mitarbeiter(String name, String gebOrt, String gebDat, int personalNummer, boolean fuehrungskraft, double gehalt) {
        super(name, gebOrt, gebDat);
        this.personalNummer = personalNummer;
        this.fuehrungskraft = fuehrungskraft;
        this.gehalt = gehalt;
    }
}
