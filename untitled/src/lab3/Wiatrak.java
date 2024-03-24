package lab3;

public class Wiatrak {
   public static final int SLOW = 1;
   public static final int MEDIUM = 2;
   public static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Wiatrak() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 1.0;
        this.color = "black";
    }

    public Wiatrak(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public String informacje() {
        String state = on ? "ON" : "OFF";
        return "Speed: " + speed +", State : " + state + ", Radius: " + radius + ", Color: " + color;
    }
    public static void main (String[] args){
        Wiatrak wiatrak1 = new Wiatrak();
        System.out.println("Wiatrak 1: " + wiatrak1.informacje());

        //Test
        Wiatrak wiatrak2 = new Wiatrak(SLOW,true,5.0,"red");
        System.out.println("Wiatrak 2: " + wiatrak2.informacje());
    }
}
