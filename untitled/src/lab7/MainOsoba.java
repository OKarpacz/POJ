package lab7;

import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MainOsoba{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean goodData = false;
        Osoba osoba = null;

        while (!goodData){
            try {
                System.out.print("What's your name?:");
                String name  = scanner.nextLine();

                System.out.print("What's your surname?:");
                String surname = scanner.nextLine();

                System.out.print("When you were born (year)?:");
                int yearOfBirth = scanner.nextInt();
                scanner.nextLine();

                osoba = new Osoba(name,surname,yearOfBirth);
                goodData = true;
            }catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Your data is:");
        System.out.println(osoba.toString());

        scanner.close();
    }
}
