public class Wolf extends Animal{

    public Wolf() {
        this.name = "Wolf";
        this.minSpeed = 8;
        this.maxSpeed = 70;
        this.stamina = 50;
    }

    public String makeNoise() {
        return "auuu!";
    }

    public int move() {
        return super.move(maxSpeed, minSpeed, stamina);
    }
}
