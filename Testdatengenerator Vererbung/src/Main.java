import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("CSV oder XML?: ");
        String choice = scanner.nextLine();
        DataGenerator generator = new DataGenerator();
        switch (choice) {
            case "CSV":
                generator = new DataGeneratorCSV(); //Upcasting
                ((DataGeneratorCSV)generator).saveData(10, 20); //Downcasting
                break;
            case "XML":
                generator = new DataGeneratorXML(); //Upcasting
                ((DataGeneratorXML)generator).saveData(10, 20); //Downcasting
                break;
            default:
                System.out.println("Bitte etwas richtiges eingeben");
        }


    }
}