package lab2;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę:");
        int array_length = scanner.nextInt();

        char[] array = new char[array_length];

        System.out.println("Podaj " + array_length + " znaki:");

        for (int i = 0; i < array_length; i++) {
            System.out.println("Znak" +(i+1)+" :");
            array[i] = scanner.next().charAt(0);
        }
        System.out.print("Tablica znaków:");
        for (int i = 0; i < array_length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}
