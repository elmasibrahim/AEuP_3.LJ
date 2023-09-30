public class GenaueUhrzeit extends Uhrzeit {
    int sek;

    public GenaueUhrzeit(int std, int min, int sek) {
        super(std,min);
        this.std = std;
        this.min = min;
        this.sek = sek;

    }

    @Override
    public void ausgabe() {
        System.out.println(super.format(std) + ":" + super.format(min) + ":" + super.format(sek));
    }
}
