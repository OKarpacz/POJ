package lab3;

import java.util.Scanner;

public class Punkt {
    private double x;
    private double y;
    public Punkt(){
        this.x = 0;
        this.y = 0;
    }
    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double calculatingDistance(double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
    }

    public double calculatingDistance(Punkt anotherPunkt){
        return Math.sqrt(Math.pow(anotherPunkt.getX() - x,2) + Math.pow(anotherPunkt.getY() - y,2));
    }

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj współrzędne pierwszego punktu (x1 y1):");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.println("Podaj współrzędne drugiego punktu (x2 y2):");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        Punkt punkt1 = new Punkt();
        punkt1.setX(x1);
        punkt1.setY(y1);

        Punkt punkt2 = new Punkt();
        punkt2.setX(x2);
        punkt2.setY(y2);

        System.out.println("Odległość między punktem 1 a punktem 2: " + punkt1.calculatingDistance(punkt2));
    }
}
