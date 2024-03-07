package lab1;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj temp w Celsjuszach: ");
        double celsius = scanner.nextDouble();


        double fahrenheit = (9.0/5.0) * celsius + 32;
        System.out.println("Twoj wynik w fahrenheit to : " + fahrenheit);
    }
}
