package lab2;
import java.util.Scanner;
public class task6 {
    private static int NWD(int a, int b){
        int c = (a>b) ? a%b : b%a;

        if(c == 0)
            return (a>b) ? b : a;
            return (a>b) ? NWD(c,b) : NWD(c,a);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę:");
        int a = scanner.nextInt();

        System.out.print("Podaj drugą liczbę:");
        int b = scanner.nextInt();

        scanner.close();

        System.out.println("Najwiekszym wspolnim dzielnikiem liczb " + a +" i " + b+ " to: " + NWD(a,b));
    }
}