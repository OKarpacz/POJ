package lab1;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Podaj pierwszy bok: ");
      double a = scanner.nextDouble();

      Scanner scanner1 = new Scanner(System.in);
      System.out.print("Podaj pierwszy bok: ");
      double b = scanner1.nextDouble();

      Scanner scanner2 = new Scanner(System.in);
      System.out.print("Podaj pierwszy bok: ");
      double c = scanner2.nextDouble();

      if(a == b && c == b){
          System.out.println("tak");
      }else{
          System.out.println("nie");
      }
    }
}
