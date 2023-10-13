import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        BaseClass base;
        HashMap<BaseClass, Integer> racers = new HashMap<BaseClass, Integer>();

        //Initialisierung der Tiere
        base = new Antilope();
        racers.put(base, 0);
        base = new Wolf();
        racers.put(base, 0);
        base = new Lion();
        racers.put(base, 0);
        base = new Horse();
        racers.put(base, 0);
        base = new Aliens("Venus", 15, 35, 30);
        racers.put(base, 0);
        base = new Cars("Mercedes", "SLS AMG", 50, 150, 50);
        racers.put(base, 0);
        base = new Human("Marcel", 15, 28, 45, 17);
        racers.put(base, 0);
        base = new Roboter("Skynet", "Terminator", 10, 40, 50);

        boolean finish = false;
        do {
            for (BaseClass animals : racers.keySet()) {
                int move = 0;
                if (animals instanceof Antilope) {
                    move = ((Antilope)animals).move();
                } else if (animals instanceof Wolf) {
                    move = ((Wolf)animals).move();
                } else if (animals instanceof Lion) {
                    move = ((Lion)animals).move();
                } else if (animals instanceof Horse) {
                    move = ((Horse)animals).move();
                } else if (animals instanceof Aliens) {
                    move = ((Aliens)animals).move();
                } else if (animals instanceof Cars) {
                    move = ((Cars)animals).move();
                } else if (animals instanceof Human) {
                    move = ((Human)animals).move();
                } else if (animals instanceof Roboter) {
                    move = ((Roboter)animals).move();
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