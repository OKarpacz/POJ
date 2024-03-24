package lab3;

import java.util.Scanner;

public class Kwadrat {
    private double a;

   public Kwadrat (double a){
       this.a = a;
   }

   public double pole() {
       return a*a;
   }

   public double obwod(){
       return a*4;
   }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj bok kwadratu :");
        int a = scanner.nextInt();
        Kwadrat kwadrat = new Kwadrat(a);

        System.out.println("Pole kwadratu to: " +  kwadrat.pole());

        System.out.println("Obwód kwadratu to: " +  kwadrat.obwod());

    }
}
