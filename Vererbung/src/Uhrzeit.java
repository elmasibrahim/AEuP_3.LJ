public class Uhrzeit {
    int std;
    int min;

    public Uhrzeit(int min) {
        this.min = min;
        this.std = 0;
    }
    public Uhrzeit(int std, int min) {
         this(min);
         this.std = std;
    }


    public void ausgabe() {
        System.out.println("Std: " + format(std));
        System.out.println("Min: " + format(min));
    }

    protected String format(int x) {
        if (x<10) {
            return "0" + x;
        } else {
            return "" + x;
        }
    }
}
