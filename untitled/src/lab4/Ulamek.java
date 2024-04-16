package lab4;

import java.util.Scanner;

public class Ulamek {
    int a;
    int b;
    int c;
    public int dodawanie(){
        c= a+b;
        return c;
    }

    public int odejmowanie(){
        c= a-b;
        return c;
    }


    public int mnozenie(){
        c =  a * b;
        return c;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Prosty Kalkulator");

        System.out.print("Podaj pierwszą liczbę: ");
        int a = scanner.nextInt();

        System.out.print("Podaj druga liczbe: ");
        int b = scanner.nextInt();
while(true) {
    System.out.println("1.Dodawnanie");
    System.out.println("2.Odejmowanie");
    System.out.println("3.Mnożenie");
    System.out.println("4.Dzielenie");
    System.out.println("Wybierz co chcesz zrobić :");
    int choice = scanner.nextInt();

    Ulamek ulamek = new Ulamek();
    switch (choice) {
        case 1:
            ulamek.dodawanie();
            break;
        case 2:
            ulamek.odejmowanie();
            break;
        case 3:
            ulamek.mnozenie();
            break;
        case 4:
            System.out.println(a + "/" + b);
    }
    scanner.close();
}
    }

}
