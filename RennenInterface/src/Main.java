import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Animal animal;
        HashMap<Animal, Integer> racers = new HashMap<Animal, Integer>();

        //Initialisierung der Tiere
        animal = new Antilope();
        racers.put(animal, 0);
        animal = new Wolf();
        racers.put(animal, 0);
        animal = new Lion();
        racers.put(animal, 0);
        animal = new Horse();
        racers.put(animal, 0);

        boolean finish = false;
        do {
            for (Animal animals : racers.keySet()) {
                int move = 0;
                if (animals instanceof Antilope) {
                    move = ((Antilope)animals).move();
                } else if (animals instanceof Wolf) {
                    move = ((Wolf)animals).move();
                } else if (animals instanceof Lion) {
                    move = ((Lion)animals).move();
                } else if (animals instanceof Horse) {
                    move = ((Horse)animals).move();
                } else {
                    System.out.println("Fehler!");
                }
                int value = racers.get(animals) + move;
                if (value >= 10000) {
                    System.out.println("Gewinner: " + animals.name);
                    finish = true;
                    break;
                }
                racers.put(animals, value);
            }
        } while (!finish);
    }
}