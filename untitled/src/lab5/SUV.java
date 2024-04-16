package lab5;


class SUV extends Car{
    boolean offRoad;

    public SUV(String brand, String color, boolean offRoadCapable) {
        super(brand, color);
        this.offRoad = offRoadCapable;
    }

    public void drive(){
        System.out.println("Driving the SUV.");
    }
}
