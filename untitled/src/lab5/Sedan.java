package lab5;

class Sedan extends Car{
    int num_seats;

    public Sedan(String brand, String color, int num_seats){
        super(color, brand);
        this.num_seats = num_seats;
    }

    public void drive(){
        System.out.println("Driving the sedan,");
    }
}
