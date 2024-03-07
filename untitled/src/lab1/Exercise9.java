package lab1;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą wspołrzędną X: ");
        double Xone = scanner.nextDouble();

        System.out.print("Podaj pierwszą wspołrzędną Y: ");
        double Yone = scanner.nextDouble();

        System.out.print("Podaj drugą wspołrzędną X: ");
        double Xtwo = scanner.nextDouble();

        System.out.print("Podaj drugą wspołrzędną Y: ");

        double Ytwo = scanner.nextDouble();

        double firstBracket = Xtwo-Xone;

        double secondBracket = Ytwo - Yone;

        double result = Math.pow(firstBracket, 2) + Math.pow(secondBracket,2);

        System.out.println("Wynikiem jest: "+result);

    }
}
