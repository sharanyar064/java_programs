package others;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class HelloSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Hello Program");

        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming", JLabel.CENTER);
        label.setFont(new Font("SansSerif", Font.PLAIN, 32));
        label.setForeground(Color.BLUE);
        label.setOpaque(true);
        label.setBackground(Color.WHITE);

        frame.add(label);
        frame.setSize(800, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
