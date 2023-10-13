public class Cars extends BaseClass {

    String model;
    int tank;

    public Cars(String name, String model, int minSpeed, int maxSpeed, int tank) {
        this.name = name;
        this.model = model;
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
        this.tank = tank;
    }

    public int move() {
        return super.move(maxSpeed, minSpeed, tank);
    }
}
