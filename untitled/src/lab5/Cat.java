package lab5;

class Cat extends Animal {
    public Cat(String name, String color) {
        super(name, color);
    }

    public String makeSound() {
        return "MEOW! Powiedział " + name + ", " + color + " kot.";
    }

}
