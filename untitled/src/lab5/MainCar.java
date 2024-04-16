package lab5;

public class MainCar {
    public static void main (String[] args){
        Car[] cars = new Car[3];
        cars[0] = new Sedan("Toyota", "Blue", 5);
        cars[1] = new SUV("Jeep", "Black", true);
        cars[2] = new SportsCar("Ferrari", "Red", 300);

        for (Car car : cars) {
            System.out.println("Brand: " + car.brand + ", Color: " + car.color);
            car.drive();
            System.out.println();
        }
    }
}
