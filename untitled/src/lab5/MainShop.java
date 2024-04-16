package lab5;

public class MainShop {
    public static void main (String[] args){
        String[] bookshop_prod = {
                "Harry Potter",
                "Lord of the Rings",
                "Game of Thrones"
        };
        Bookshop bookshop = new Bookshop("Main Street 1221","Big", bookshop_prod);

        String[] bakery_prod={
                "Bread",
                "Croissant",
                "Cake"
        };
        Bakery bakery = new Bakery("West Street 12345","Small", bakery_prod);

        System.out.println(bakery.getInformation());
        System.out.println(bookshop.getInformation());
    }
}
