package lab4;
import java.util.Random;

public class Gra {
    private int number;
    private int max;
    private int guessCount = 5;

    public Gra(int max){
        this.max = max;
        play();
    }

    private void play (){
        Random rand = new Random();
        number = rand.nextInt(max) + 1;
    }

    public boolean check(int choice) {
        if (choice == number) {
            System.out.println("You Won!");
            return true;
        } else if (choice < number) {
            System.out.println("Your guess is to small :(");
        } else {
            System.out.println("You guessed to high :(");
        }
        guessCount--;
        if(guessCount == 0){
            System.out.println("Game over! The number was "+ number);
            return true;
        }
        System.out.println("Choices left: " + guessCount);
        return false;
    }
}
