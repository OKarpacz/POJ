package lab1;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         System.out.print("Enter temperature you want to convert in Celsius:");

         int userInput = input.nextInt();
         double ulamek = 9.0/5.0;
         double fahranheit = ulamek * userInput + 32.0;
         System.out.println("The temperature in fahranheit is : "+fahranheit);
     }
}
