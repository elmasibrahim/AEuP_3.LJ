public class Aliens extends BaseClass {

    String planet;

    public Aliens(String planet, int minSpeed, int maxSpeed, int stamina) {
        this.planet = planet;
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
        this.stamina = stamina;
    }

    public int move() {
        return super.move(maxSpeed, minSpeed, stamina);
    }
}
