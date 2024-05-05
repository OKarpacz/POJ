import javax.swing.*;

public class Divider {
    public static void main(String[] args) {
        String number = JOptionPane.showInputDialog(null, "Podaj liczbę");
        String divider = JOptionPane.showInputDialog(null, "Podaj dzielnik");

        int result = convertToInteger(number)/convertToInteger(divider);
        JOptionPane.showMessageDialog(null, String.format("Wynik dzielenia to %d", result));
    }

    private static int convertToInteger(String number){
        return Integer.parseInt(number);
    }
}
