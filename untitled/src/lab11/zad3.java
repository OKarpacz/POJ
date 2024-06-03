package lab11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class zad3 extends JFrame {
    private JTextField inputField;
    private JLabel reversedLabel;

    public zad3() {
        setTitle("Odwróć łańcuch znaków");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLayout(new FlowLayout());

        JLabel promptLabel = new JLabel("Wprowadź tekst:");
        inputField = new JTextField(20);
        JButton reverseButton = new JButton("Odwróć");
        reversedLabel = new JLabel();

        reverseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reverseString();
            }
        });

        add(promptLabel);
        add(inputField);
        add(reverseButton);
        add(reversedLabel);

        setVisible(true);
    }

    private void reverseString() {
        String inputText = inputField.getText();
        String reversedText = new StringBuilder(inputText).reverse().toString();
        reversedLabel.setText("Odwrócony tekst: " + reversedText);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new zad3();
            }
        });
    }
}
