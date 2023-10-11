import java.util.Random;

public class Animal {
    public String name;

    Random random = new Random();

    public int move(int maxSpeed, int minSpeed, int stamina) {
        int randomSpeed = random.nextInt(maxSpeed - minSpeed + 1) + minSpeed;
        return randomSpeed * stamina;
    }

    public String makeNoise() {
        return "Noise";
    }
}
