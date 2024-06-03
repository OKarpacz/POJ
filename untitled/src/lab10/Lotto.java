package lab10;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Lotto {
    public static Set<Integer> userInputNumbers() {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> usersNumbers = new HashSet<>();
        System.out.println("Podaj 6 liczb z zakresu 1-49: ");
        while (usersNumbers.size() < 6) {
            if (scanner.hasNextInt()) {
                int liczba = scanner.nextInt();
                if (liczba >= 1 && liczba <= 49) {
                    usersNumbers.add(liczba);
                } else {
                    System.out.println("Liczba spoza zakresu 1-49. Podaj inną liczbę.");
                }
            } else {
                System.out.println("To nie jest liczba. Podaj inną liczbę.");
                scanner.next();
            }
        }
        scanner.close();
        return usersNumbers;
    }
    private static Set<Integer> Comppick() {
        Random random = new Random();
        Set<Integer> compPickedNum = new HashSet<>();

        while (compPickedNum.size() < 6) {
            int liczba = random.nextInt(49) + 1;
            compPickedNum.add(liczba);
        }
        return compPickedNum;
    }
    private static int check(Set<Integer> usersNumbers, Set<Integer> compPickedNum) {
        int truths = 0;
        for (int liczba : usersNumbers) {
            if (compPickedNum.contains(liczba)) {
                truths++;
            }
        }
        return truths;
    }
    public static void main(String[] args) {
        Set<Integer> wybraneLiczby = userInputNumbers();
        Set<Integer> wylosowaneLiczby = Comppick();

        System.out.println("Twoje wybrane liczby: " + wybraneLiczby);
        System.out.println("Wylosowane liczby: " + wylosowaneLiczby);

        int trafienia = check(wybraneLiczby, wylosowaneLiczby);
        System.out.println("Liczba trafień: " + trafienia);
    }

}
