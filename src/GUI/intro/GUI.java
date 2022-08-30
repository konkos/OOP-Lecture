package GUI.intro;

import javax.swing.*;

public class GUI extends JFrame {
    private final JPanel panel;

    public GUI() {
        panel = new JPanel();

        this.setContentPane(panel);
        this.setVisible(true);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
