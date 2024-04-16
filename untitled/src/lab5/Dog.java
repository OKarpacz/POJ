package lab5;

class Dog extends Animal {
    public Dog(String name, String color) {
        super(name, color);
    }

    public String makeSound() {
        return "WOOF! Powiedział " + name + ", " + color + " pies.";
    }
}
