public class Antilope extends BaseClass {

    public Antilope() {
        this.name = "Antilope" ;
        this.minSpeed = 20;
        this.maxSpeed = 80;
        this.stamina = 40;
    }

    public String makeNoise() {
        return "roaar!";
    }

    public int move() {
        return super.move(maxSpeed, minSpeed, stamina);
    }
}
