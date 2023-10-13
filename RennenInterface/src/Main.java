import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        BaseClass base;
        HashMap<BaseClass, Integer> racers = new HashMap<BaseClass, Integer>();

        //Initialisierung der Rennteilnehmer
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
            for (BaseClass racer : racers.keySet()) {
                int move = 0;
                if (racer instanceof Antilope) {
                    move = ((Antilope)racer).move();
                } else if (racer instanceof Wolf) {
                    move = ((Wolf)racer).move();
                } else if (racer instanceof Lion) {
                    move = ((Lion)racer).move();
                } else if (racer instanceof Horse) {
                    move = ((Horse)racer).move();
                } else if (racer instanceof Aliens) {
                    move = ((Aliens)racer).move();
                } else if (racer instanceof Cars) {
                    move = ((Cars)racer).move();
                } else if (racer instanceof Human) {
                    move = ((Human)racer).move();
                } else if (racer instanceof Roboter) {
                    move = ((Roboter)racer).move();
                } else {
                    System.out.println("Fehler!");
                }
                int value = racers.get(racer) + move;
                if (value >= 10000) {
                    String name = "";
                    if (racer instanceof Roboter) {
                        name = ((Roboter) racer).typbezeichnung;
                    } else if (racer instanceof Aliens) {
                        name = ((Aliens) racer).planet;
                    } else {
                        name = racer.name;
                    }
                    System.out.println("Gewinner: " + name);
                    finish = true;
                    break;
                }
                racers.put(racer, value);
            }
        } while (!finish);
    }
}