import java.util.Random;

public class Animal {
    protected String name;
    protected int maxSpeed;
    protected int minSpeed;
    protected int stamina;

    Random random = new Random();

    protected int move(int maxSpeed, int minSpeed, int stamina) {
        int randomSpeed = random.nextInt(maxSpeed - minSpeed + 1) + minSpeed;
        return randomSpeed * stamina;
    }
}
