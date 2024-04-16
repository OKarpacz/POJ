package lab5;

public class Car {
    String brand;
    String color;

    public Car(String brand, String color){
        this.color = color;
        this.brand = brand;
    }
    public void drive(){
       System.out.println("Driving the car.");
    }
}
