package lab5;

public class Main{
    public static void main(String[] args) {
        Cat cat = new Cat("Garfield", "rudy");
        Dog dog = new Dog("Tofik", "czarny");

        System.out.println(dog.makeSound());
        System.out.println(cat.makeSound());
    }
}
