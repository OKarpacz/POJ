package lab1;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj pierwszą liczbę: ");
            double a = scanner.nextDouble();

            System.out.print("Podaj drugą liczbę: ");
            double b = scanner.nextDouble();

            System.out.print("Podaj trzecią liczbę: ");
            double c = scanner.nextDouble();

            if(a < b && b < c){
                System.out.print(c + " " + b + " " + a);
            } else if(b < c && c < a){
                System.out.print(a + " " + c + " " + b);
            } else if (c < b && b < a){
                System.out.print(a + " " + b + " " + c);
            } else if (a == b && b == c) {
                System.out.print("Wszystkie podane liczby są równe");
            }
        }
    }

