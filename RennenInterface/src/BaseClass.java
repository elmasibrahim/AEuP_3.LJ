import java.util.Random;

interface BaseInterface {
    int move(int maxSpeed, int minSpeed, int stamina);
    String makeNoise();
}

public class BaseClass implements BaseInterface{
    protected String name;
    protected int maxSpeed;
    protected int minSpeed;
    protected int stamina;

    Random random = new Random();

    public int move(int maxSpeed, int minSpeed, int stamina) {
        int randomSpeed = random.nextInt(maxSpeed - minSpeed + 1) + minSpeed;
        return randomSpeed * stamina;
    }

    public String makeNoise() {
        return "Noise";
    }
}
