package lab4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Game");
        System.out.print("Give the maximum the number can be: ");
        int max = scanner.nextInt();
        Gra gra = new Gra(max);

        System.out.println("Guess the number from 1 to " + max + ":");
        boolean gamEnd = false;
        while (!gamEnd) {
            System.out.println("What's your guess: ");
            int choice = scanner.nextInt();
            gamEnd = gra.check(choice);
        }
        scanner.close();
    }
}
