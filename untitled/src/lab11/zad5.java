package lab11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.*;
import java.time.format.*;
import java.util.Locale;


public class zad5 extends JFrame {
    private JTextField dateField;
    private JLabel dayOfWeekLabel;

    public zad5() {
        setTitle("Dzień tygodnia dla daty");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);
        setLayout(new FlowLayout());

        JLabel promptLabel = new JLabel("Wprowadź datę (RRRR-MM-DD):");
        dateField = new JTextField(10);
        JButton checkButton = new JButton("Sprawdź");
        dayOfWeekLabel = new JLabel();

        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkDayOfWeek();
            }
        });

        add(promptLabel);
        add(dateField);
        add(checkButton);
        add(dayOfWeekLabel);

        setVisible(true);
    }

    private void checkDayOfWeek() {
        try {
            String dateString = dateField.getText();
            LocalDate date = LocalDate.parse(dateString);

            DayOfWeek dayOfWeek = date.getDayOfWeek();
            String dayOfWeekName = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault());

            dayOfWeekLabel.setText("Dzień tygodnia: " + dayOfWeekName);
        } catch (DateTimeParseException ex) {
            dayOfWeekLabel.setText("Błąd: Nieprawidłowy format daty!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new zad5();
            }
        });
    }
}
