package lab5;

public class Shop {
    String address;
    String size;

    public Shop(String address, String size){
        this.size = size;
        this.address = address;
    }
    public String getInformation() {
        return "It is based at " + address + " and the size is " + size;
    }
}