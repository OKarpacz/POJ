package lab11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class zad6 extends JFrame {
    private JTextField displayField;

    private String currentInput = "";
    private double result = 0;
    private char lastOperator;

    public zad6() {
        setTitle("Prosty kalkulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLayout(new BorderLayout());

        displayField = new JTextField();
        displayField.setEditable(false);
        add(displayField, BorderLayout.NORTH);

        JPanel buttonsPanel = new JPanel(new GridLayout(4, 4));

        String[] buttonLabels = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "C", "0", "=", "+"};

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            buttonsPanel.add(button);
        }

        add(buttonsPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    private void processInput(char input) {
        if (Character.isDigit(input)) {
            currentInput += input;
            displayField.setText(currentInput);
        } else if (input == 'C') {
            currentInput = "";
            displayField.setText("");
            result = 0;
            lastOperator = '\0';
        } else if (input == '=') {
            calculateResult();
        } else {
            if (!currentInput.isEmpty()) {
                double number = Double.parseDouble(currentInput);
                applyOperator(number);
                lastOperator = input;
                currentInput = "";
            }
        }
    }

    private void applyOperator(double number) {
        switch (lastOperator) {
            case '+':
                result += number;
                break;
            case '-':
                result -= number;
                break;
            case '*':
                result *= number;
                break;
            case '/':
                if (number != 0) {
                    result /= number;
                } else {
                    displayField.setText("Error: Division by zero");
                }
                break;
            default:
                result = number;
                break;
        }
        displayField.setText(Double.toString(result));
    }

    private void calculateResult() {
        if (!currentInput.isEmpty()) {
            double number = Double.parseDouble(currentInput);
            applyOperator(number);
            currentInput = "";
            lastOperator = '\0';
        }
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String actionCommand = e.getActionCommand();
            char input = actionCommand.charAt(0);
            processInput(input);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new zad6();
            }
        });
    }
}
