package lab11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class zad1 extends JFrame {
     JTextField celsiusField;
     JLabel fahrenheitLabel;

    public zad1() {
        setTitle("Konwerter stopni Celsiusza na Fahrenheita");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 150);
        setLayout(new FlowLayout());

        JLabel celsiusLabel = new JLabel("Stopnie Celsiusza:");
        celsiusField = new JTextField(10);
        JButton convertButton = new JButton("Konwertuj");
        fahrenheitLabel = new JLabel("Stopnie Fahrenheita:");

        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                convertCelsiusToFahrenheit();
            }
        });

        add(celsiusLabel);
        add(celsiusField);
        add(convertButton);
        add(fahrenheitLabel);

        setVisible(true);
    }

    private void convertCelsiusToFahrenheit() {
        try {
            double celsius = Double.parseDouble(celsiusField.getText());
            double fahrenheit = (celsius * 9 / 5) + 32;
            fahrenheitLabel.setText("Stopnie Fahrenheita: " + fahrenheit);
        } catch (NumberFormatException ex) {
            fahrenheitLabel.setText("Błąd: Podaj liczbę jako stopnie Celsiusza");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new zad1();
            }
        });
    }
}
