package lab5;
class SportsCar extends Car {
    int topSpeed;

    public SportsCar(String brand, String color, int topSpeed){
        super(brand, color);
        this.topSpeed = topSpeed;
    }
    public void drive() {
        System.out.println("Driving the Sports Car,");
    }
}
