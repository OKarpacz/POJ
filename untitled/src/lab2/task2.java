package lab2;

import java.util.Scanner;

class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wielkość tablicy: ");
        int size = Integer.parseInt(scanner.nextLine());


        int[] array = new int[size];

        System.out.print("Podaj wartość początkową: ");
        int startValue = scanner.nextInt();
        array[0] = startValue;


        if (startValue % 2 != 0) {
            startValue++;
        } else {
            startValue += 2;
        }
        for (int i = 1; i < size; i++) {
            array[i] = startValue;
            startValue += 2;
        }


        System.out.print("Zawartość tablicy: ");
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]");

        scanner.close();

    }
}
