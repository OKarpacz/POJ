package lab1;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.print("Podaj dwie litery: ");
         char firstchar = scanner.next().charAt(0);
         char secondchar = scanner.next().charAt(0);

         if(firstchar == secondchar){
             System.out.println("Litery są takie same");
         }else if( firstchar < secondchar){
             System.out.println(secondchar+" jest dalej w alfabecie niż " + firstchar);
         }else{
             System.out.println(firstchar+" jest dalej w alfabecie niż " + secondchar);
         }


    }
}