import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DataGeneratorCSV extends DataGenerator {

    public void saveData(double min, double max) {
        createData(min, max);
        String fileName = "output.csv";

        //try-with-resources-Anweisung, damit BufferedWriter wieder ordnungsgemäß geschlossen wird
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            for (Double value : dataSet) {
                writer.write(value.toString()); //Double-Wert als String
                writer.newLine(); //Neue Zeile für nächsten Wert
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
