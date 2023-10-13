public class Human extends BaseClass {

     public int age;

    public Human(String name, int minSpeed, int maxSpeed, int stamina, int age) {
        this.name = name;
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
        this.stamina = stamina;
        this.age = age;
    }

    public int move() {
        return super.move(maxSpeed, minSpeed, stamina);
    }
}
