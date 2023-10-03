import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileOutputStream;

public class DataGeneratorXML extends DataGenerator {

    public void saveData(double min, double max) {
        createData(min, max);
        String fileName = "output.xml";

        try {
            XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
            XMLStreamWriter writer = xmlOutputFactory.createXMLStreamWriter(new FileOutputStream(fileName), "UTF-8");

            //Äußeren Tag schreiben
            writer.writeStartDocument("UTF-8", "1.1");
            writer.writeStartElement("Werte");

            //Werte als innere Tags
            for (Double value : dataSet) {
                writer.writeStartElement("Wert");
                writer.writeCharacters(value.toString());
                writer.writeEndElement();
            }

            //Äußeren Tag schließen
            writer.writeEndElement();
            writer.writeEndDocument();
            writer.flush();
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
