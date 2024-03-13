package lab2;

import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wielkość tablicy: ");
        int rozmiarTablicy = scanner.nextInt();


        char[] tablica = new char[rozmiarTablicy];
        char[] tablicaSec = new char[rozmiarTablicy];

        System.out.println("Podaj wartości do pierwszej tablicy:");
        for (int i = 0; i < rozmiarTablicy; i++) {
            System.out.print("Podaj znak do pozycji " + (i + 1) + ": ");
            char znak = scanner.next().charAt(0);
            tablica[i] = znak;
        }

        System.out.println("Podaj teraz wartości do drugiej tablicy:");
        for (int i = 0; i < rozmiarTablicy; i++) {
            System.out.print("Podaj znak do pozycji " + (i + 1) + ": ");
            char znak = scanner.next().charAt(0);
            tablicaSec[i] = znak;
        }

        System.out.print("Zawartość tablicy pierwszej: [");
        for (int i = 0; i < rozmiarTablicy; i++) {
            System.out.print(tablica[i]);
            if (i < rozmiarTablicy - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Zawartość tablicy drugiej: [");
        for (int i = 0; i < rozmiarTablicy; i++) {
            System.out.print(tablicaSec[i]);
            if (i < rozmiarTablicy - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        //DOPISAC SUME
       // System.out.println("Suma tych tabel to:");
         //    int firstSum = tablicaSec[0] + tablica[0];
           //  System.out.println(firstSum);

    }
}
