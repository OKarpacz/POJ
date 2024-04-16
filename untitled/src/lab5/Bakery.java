package lab5;

class Bakery extends Shop{
    String[] products;

    public Bakery(String address, String size, String[] products){
        super(address,size);
        this.products = products;
    }

    public String getInformation(){
        String productLists = String.join(",", products);
        return super.getInformation() + ", Products: " + productLists;
    }
}
