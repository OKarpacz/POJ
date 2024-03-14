package lab2;
//DO DOKONCZENIA
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wielkość tablicy: ");
        int rozmiarTablicy = scanner.nextInt();


<<<<<<<<< Temporary merge branch 1
         int[] array = new int[size];

         System.out.print("Podaj wartość początkową: ");
         int startValue = scanner.nextInt();
         array[0] = startValue;
=========
        char[] tablica = new char[rozmiarTablicy];
>>>>>>>>> Temporary merge branch 2


        for (int i = 0; i < rozmiarTablicy; i++) {
            System.out.print("Podaj znak do pozycji " + (i + 1) + ": ");
            char znak = scanner.next().charAt(0);
            tablica[i] = znak;
        }

        System.out.print("Zawartość tablicy: [");
        for (int i = 0; i < rozmiarTablicy; i++) {
            System.out.print(tablica[i]);
            if (i < rozmiarTablicy - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
