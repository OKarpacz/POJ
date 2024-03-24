package lab3;
import java.util.ArrayList;
import java.util.List;


public class Konto {
    private int id;
    private double balance;
    private List<Double> depositHistory;

    public Konto(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.depositHistory = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            depositHistory.add(amount);
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public List<Double> getDepositHistory() {
        return depositHistory;
    }
}
