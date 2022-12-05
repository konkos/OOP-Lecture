package GUI.intro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private final JPanel panel;
    private JButton btn1;
    private JTextField textField;

    public GUI() {
        panel = new JPanel();
        btn1 = new JButton("Click Me!");
        textField = new JTextField(10);

        btn1.addActionListener(new MyButtonListener());

        panel.add(btn1);
        panel.add(textField);
        this.setContentPane(panel);
        this.setVisible(true);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class MyButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button Pressed");
        }
    }
}
