package lab2;

import java.util.Arrays;
import java.util.Scanner;

class task2 {
    int sum = 0;
    int minimum(int[] array){
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
    int maximum(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
    int sum(int[] array) {
        int totalSum = 0;
        for (int value : array) {
            totalSum += value;
        }
        return totalSum;
    }
    double average(int totalSum, int size){
        double averageInTable = totalSum/size;
        return averageInTable;
    }
    double median(int[] array){
        Arrays.sort(array);
        if (array.length % 2 == 0){
            return (array[array.length/2 - 1]  + array[array.length/2]) /2.0;
        }else {
            return array[array.length/2];
        }
    }
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

        task2 task = new task2();

        int min = task.minimum(array);
        int max = task.maximum(array);
        int totalSum = task.sum(array);
        double avg = task.average(totalSum, size);
        double med = task.median(array);

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Sum: " + totalSum);
        System.out.println("Average: " + avg);
        System.out.println("Median: " + med);

        scanner.close();
    }
}
