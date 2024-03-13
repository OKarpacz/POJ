package lab2;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ilość kolumn do pierwszej tablicy:");
        int columnsOne = scanner.nextInt();

        System.out.println("Podaj ilość rzędów do pierwszej tablicy");
        int rowsOne = scanner.nextInt();

        int[][] matrixOne = new int[columnsOne][rowsOne];

        for (int i = 0; i < columnsOne; i++) {
            for (int j = 0; j < rowsOne; j++) {
                System.out.println("Podaj wartość dla [" + i + "][" + j + "]");
                matrixOne[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Podaj ilość kolumn do drugiej tablicy:");
        int columnsTwo = scanner.nextInt();

        System.out.println("Podaj ilość rzędów do drugiej tablicy");
        int rowsTwo = scanner.nextInt();

        int[][] matrixTwo = new int[columnsTwo][rowsTwo];

        if (columnsTwo != columnsOne || rowsTwo != rowsOne) {
            System.out.println("Nie można dodać dwóch innych matryc!");
        } else {

            for (int i = 0; i < columnsTwo; i++) {
                for (int j = 0; j < rowsTwo; j++) {
                    System.out.println("Podaj wartość dla [" + i + "][" + j + "]");
                    matrixTwo[i][j] = scanner.nextInt();
                }
            }
            System.out.println("Pierwsza tablica:");

            for (int i = 0; i < columnsOne; i++) {
                System.out.print("[");
                for (int j = 0; j < rowsOne; j++) {
                    System.out.print(matrixOne[i][j]);
                }
                System.out.println("]");
            }

            System.out.println("Druga tablica:");

            for (int i = 0; i < columnsTwo; i++) {
                System.out.print("[");
                for (int j = 0; j < rowsTwo; j++) {
                    System.out.print(matrixTwo[i][j]);
                }
                System.out.println("]");
            }
            System.out.println("Suma tych dwóch tablic to:");
            int[][]sumMatrix = new int[columnsOne][columnsTwo];
            for (int i = 0; i <columnsOne; i++){
                for(int j = 0; j < rowsOne;j++){
                    sumMatrix[i][j] = matrixOne[i][j] + matrixTwo[i][j];
                }
            }

            for(int i = 0; i < columnsOne; i++){
                System.out.print("[");
                for(int j = 0; j < rowsOne; j++){
                    System.out.print(sumMatrix[i][j]);
                }
            System.out.println("]");
            }
        }
    scanner.close();
    }
}