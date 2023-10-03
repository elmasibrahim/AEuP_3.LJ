import java.util.ArrayList;
import java.util.Random;

public class DataGenerator {
    ArrayList<Double> dataSet =  new ArrayList<Double>();

    protected void createData(double min, double max) {
        Random random = new Random();
        for(byte i = 0; i < 100; i++) {
            double randomValue = min + (max - min) * random.nextDouble();
            randomValue = Math.round(randomValue * 100.0) / 100.0;
            dataSet.add(randomValue);
        }
    }
}
