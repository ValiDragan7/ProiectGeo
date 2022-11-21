import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MyFrame extends JFrame implements ActionListener {
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;

    MyFrame() {

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setLayout(new GridLayout(3, 3, 10, 15));
        this.setSize(800, 500);

        button1 = new JButton("Problema 1");
        button1.setBackground(Color.CYAN);
        button1.setFocusable(false);
        button1.setFont(new Font("Ariel", Font.BOLD, 20));
        button1.setForeground(new Color(76, 115, 38));
        button1.addActionListener(this);

        button2 = new JButton("Problema 2");
        button2.setFocusable(false);
        button2.setBackground(Color.cyan);
        button2.setFont(new Font("Ariel", Font.BOLD, 20));
        button2.setForeground(new Color(76, 115, 38));
        button2.addActionListener(this);

        button3 = new JButton("Problema 3");
        button3.setFocusable(false);
        button3.setFont(new Font("Ariel", Font.BOLD, 20));
        button3.setForeground(new Color(255, 0, 0));

        button4 = new JButton("Problema 4");
        button4.setFocusable(false);
        button4.setBackground(Color.cyan);
        button4.setFont(new Font("Ariel", Font.BOLD, 20));
        button4.setForeground(new Color(76, 115, 38));
        button4.addActionListener(this);

        button5 = new JButton("Problema 5");
        button5.setFocusable(false);
        button5.setFont(new Font("Ariel", Font.BOLD, 20));
        button5.setForeground(new Color(255, 0, 0));

        button6 = new JButton("Problema 6");
        button6.setFocusable(false);
        button6.setFont(new Font("Ariel", Font.BOLD, 20));
        button6.setForeground(new Color(255, 0, 0));

        button7 = new JButton("Problema 7");
        button7.setFocusable(false);
        button7.setFont(new Font("Ariel", Font.BOLD, 20));
        button7.setForeground(new Color(255, 0, 0));

        button8 = new JButton("Problema 8");
        button8.setFocusable(false);
        button8.setFont(new Font("Ariel", Font.BOLD, 20));
        button8.setForeground(new Color(255, 0, 0));

        button9 = new JButton("Problema 9");
        button9.setFocusable(false);
        button9.setFont(new Font("Ariel", Font.BOLD, 20));
        button9.setForeground(new Color(255, 0, 0));

        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        this.add(button6);
        this.add(button7);
        this.add(button8);
        this.add(button9);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            this.dispose();
            new Problema1GUI();
        }
        if (e.getSource() == button2) {
            this.dispose();
            new Problema2GUI();
        }
        if (e.getSource() == button4) {
            this.dispose();
            new Problema4GUI();
        }
    }

}
