package lab11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class zad2 extends JFrame {
    private int secretNumber;
    private JTextField guessField;
    private JLabel resultLabel;

    public zad2() {
        setTitle("Gra w zgadywanie liczby");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLayout(new FlowLayout());

        Random random = new Random();
        secretNumber = random.nextInt(100) + 1;

        JLabel promptLabel = new JLabel("Zgadnij liczbę (1-100):");
        guessField = new JTextField(10);
        JButton guessButton = new JButton("Zgadnij");
        resultLabel = new JLabel();

        guessButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });

        add(promptLabel);
        add(guessField);
        add(guessButton);
        add(resultLabel);

        setVisible(true);
    }

    private void checkGuess() {
        try {
            int guess = Integer.parseInt(guessField.getText());
            if (guess < secretNumber) {
                resultLabel.setText("Spróbuj wyżej!");
            } else if (guess > secretNumber) {
                resultLabel.setText("Spróbuj niżej!");
            } else {
                resultLabel.setText("Zgadłeś!");
            }
        } catch (NumberFormatException ex) {
            resultLabel.setText("Błąd: Wpisz liczbę!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new zad2();
            }
        });
    }
}
