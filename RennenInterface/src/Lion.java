public class Lion extends Animal {

    public Lion() {
        this.name = "Lion";
        this.minSpeed = 5;
        this.maxSpeed = 60;
        this.stamina = 60;
    }

    public String makeNoise() {
        return "roaar!";
    }

    public int move() {
        return super.move(maxSpeed, minSpeed, stamina);
    }
}
