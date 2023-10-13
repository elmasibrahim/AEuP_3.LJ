public class Roboter extends BaseClass {
    public String hersteller;
    public String typbezeichnung;
    public int energy;

    public Roboter(String hersteller, String typbezeichnung, int minSpeed, int maxSpeed, int energy) {
        this.hersteller = hersteller;
        this.typbezeichnung = typbezeichnung;
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
        this.energy = energy;
    }

    public int move() {
        return super.move(maxSpeed, minSpeed, energy);
    }
}
