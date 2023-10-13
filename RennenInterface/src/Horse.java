public class Horse extends BaseClass {

    public Horse() {
        this.name = "Horse";
        this.minSpeed = 2;
        this.maxSpeed = 80;
        this.stamina = 100;
    }

    public String makeNoise() {
        return "wieher!";
    }

    public int move() {
        return super.move(maxSpeed, minSpeed, stamina);
    }
}
