package lab1;

import java.util.Random;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomSign = random.nextInt(3);


        Scanner scanner = new Scanner(System.in);
        System.out.println("0 - KAMIEŃ");
        System.out.println("1 - PAPIER");
        System.out.println("2 - NOŻYCE");
        System.out.print("Podaj liczbę od 0 - 2: ");

         double pick = scanner.nextDouble();

         System.out.println("Komputer wybrał " + randomSign);

        if(pick == randomSign){
            System.out.println("Remis");
        } else if (pick == 0 && randomSign == 1 || pick == 1 && randomSign == 2 || pick == 2 && randomSign == 0) {
            System.out.println("Przegrałeś");
        }else{
            System.out.println("Wygrałeś");
        }
    }
}
