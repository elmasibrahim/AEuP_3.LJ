import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        HashMap<Animal, Integer> racers = new HashMap<Animal, Integer>();
        animal = new Horse();
        animal.name = "Horse";
        racers.put(animal, 0);
        animal = new Antilope();
        animal.name = "Antilope";
        racers.put(animal, 0);
        animal = new Wolf();
        animal.name = "Wolf";
        racers.put(animal, 0);
        animal = new Lion();
        animal.name = "Lion";
        racers.put(animal, 0);

        boolean finish = false;
        do {
            byte counter = 0;
            for (Animal animals : racers.keySet()) {
                int minSpeed = 0;
                int maxSpeed = 0;
                int stamina = 0;
                counter++;
                switch (counter) {
                    case 1:
                        minSpeed = 2;
                        maxSpeed = 80;
                        stamina = 100;
                        break;
                    case 2:
                        minSpeed = 20;
                        maxSpeed = 80;
                        stamina = 40;
                        break;
                    case 3:
                        minSpeed = 8;
                        maxSpeed = 70;
                        stamina = 50;
                        break;
                    case 4:
                        minSpeed = 5;
                        maxSpeed = 60;
                        stamina = 60;
                        break;
                }
                int value = racers.get(animals) + animals.move(maxSpeed, minSpeed, stamina);
                if (value >= 10000) {
                    System.out.println("Gewinner: " + animals.name + ". " + animals.makeNoise());
                    finish = true;
                    break;
                }
                racers.put(animals, value);
            }
        } while (!finish);
    }
}