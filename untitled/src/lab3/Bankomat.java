package lab3;

import java.util.Scanner;

public class Bankomat {
    private Konto[] konta;

    public Bankomat() {
        konta = new Konto[10];
        for (int i = 0; i < 10; i++) {
            konta[i] = new Konto(i + 1, 100);
        }
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int id = 1;

        while (true) {
            System.out.println("\nMain Menu");
            System.out.println("1. Check deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Choose an Option: ");
            int choice = scanner.nextInt();

            if (choice == 4) {
                System.out.println("...");
                System.out.print("Enter your ID: ");
                id = scanner.nextInt();
            }

            if (choice != 4 || (id >= 1 && id <= 10)) {
                switch (choice) {
                    case 1:
                        System.out.println("Your Balance is: " + konta[id - 1].getBalance());
                        break;
                    case 2:
                        System.out.print("Enter an amount you want to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        konta[id - 1].withdraw(withdrawAmount);
                        break;
                    case 3:
                        System.out.print("Enter an amount you want to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        konta[id - 1].deposit(depositAmount);
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("ERROR.");
                        break;
                }
            } else {
                System.out.println("ERROR.");
            }
        }
    }

    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat();
        bankomat.menu();
    }
}
