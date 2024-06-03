package lab11;

import javax.swing.*;
import java.awt.*;
public class zad4 extends JFrame {
    public zad4() {
        setTitle("Flagi różnych krajów");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        JPanel flagsPanel = new JPanel(new GridLayout(3, 1));

        ImageIcon flag1 = new ImageIcon("flag1.png");
        ImageIcon flag2 = new ImageIcon("flag2.png");
        ImageIcon flag3 = new ImageIcon("flag3.png");

        JLabel label1 = new JLabel(flag1);
        JLabel label2 = new JLabel(flag2);
        JLabel label3 = new JLabel(flag3);

        flagsPanel.add(label1);
        flagsPanel.add(label2);
        flagsPanel.add(label3);

        add(flagsPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new zad4();
            }
        });
    }
}
