package lab7;

import javax.swing.*;

public class Divider {
    public static void main(String[] args) {
        try {
            String number = JOptionPane.showInputDialog(null, "Podaj liczbę");
            String divider = JOptionPane.showInputDialog(null, "Podaj dzielnik");

            int num = convertToInteger(number);
            int div = convertToInteger(divider);

            if (div == 0) {
                throw new ArithmeticException("Nie można dzielić przez zero");
            }

            int result = num / div;
            JOptionPane.showMessageDialog(null, String.format("Wynik dzielenia to %d", result));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Błąd, wprowadzono niepoprawną liczbę");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Błąd, nie można dzielić przez zero");
        }
    }

    private static int convertToInteger(String number) {
        return Integer.parseInt(number);
    }
}
