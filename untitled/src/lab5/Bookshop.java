package lab5;

import java.awt.print.Book;

class Bookshop extends Shop {
    String[] products;

    public Bookshop(String address, String size, String[] products) {
        super(address, size);
        this.products = products;
    }

    public String getInformation() {
        String productsList = String.join(", ", products);
        return super.getInformation() + ", Products: " + productsList;
    }
}
