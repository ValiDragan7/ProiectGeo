import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Problema4GUI extends JFrame implements ActionListener {
    Problema4 problema4 = new Problema4();
    JTextArea cerinTextArea, puncteTextArea, punctMArea;
    JTextField mx, my;
    JButton rezButton, setMButton, inapoiButton;
    JLabel label;
    ImageIcon image = new ImageIcon("lib/poligonconvex.png");

    Problema4GUI() {
        // text fields pt m;
        my = new JTextField();
        my.setBounds(100, 200, 100, 50);
        my.setFont(new Font("Calibri", Font.PLAIN, 20));
        my.setBackground(new Color(236, 150, 242));
        mx = new JTextField();
        mx.setBackground(new Color(236, 150, 242));
        mx.setBounds(100, 130, 100, 50);
        mx.setFont(new Font("Calibri", Font.PLAIN, 20));
        // text area pt cerinta
        cerinTextArea = new JTextArea(
                "  Localizarea in timp real intr-un poligon convex\n  Un poligon se numeste convex daca pentru orice A,B care se afla in interiorul poligonului,  segmentul dintre aceste puncte trece tot prin interiorul poligonului.");
        cerinTextArea.setBounds(0, 0, 800, 80);
        cerinTextArea.setFont(new Font("Calibri", Font.PLAIN, 20));
        cerinTextArea.setLineWrap(true);
        cerinTextArea.setEditable(false);
        cerinTextArea.setBackground(new Color(56, 128, 183));
        cerinTextArea.setWrapStyleWord(true);
        // text area pt puncte
        puncteTextArea = new JTextArea(problema4.puncteToString());
        puncteTextArea.setBounds(0, 80, 800, 40);
        puncteTextArea.setFont(new Font("Calibri", Font.PLAIN, 30));
        puncteTextArea.setLineWrap(true);
        puncteTextArea.setEditable(false);
        puncteTextArea.setBackground(new Color(56, 222, 205));
        puncteTextArea.setWrapStyleWord(true);

        punctMArea = new JTextArea(problema4.mtoString());
        punctMArea.setBounds(100, 75, 150, 35);
        punctMArea.setFont(new Font("Calibri", Font.PLAIN, 30));
        punctMArea.setBackground(new Color(245, 189, 8));
        punctMArea.setEditable(false);
        // panel
        JPanel panel = new JPanel();
        panel.setOpaque(true);
        panel.setBounds(400, 120, 400, 500);
        panel.setBackground(new Color(245, 189, 8));
        panel.setLayout(null);
        panel.add(mx);
        panel.add(my);
        panel.add(punctMArea);

        // label
        label = new JLabel();
        label.setOpaque(true);
        label.setBounds(0, 120, 400, 500);
        label.setLayout(null);
        label.setBackground(new Color(245, 189, 8));
        label.setIcon(image);
        label.setVerticalAlignment(JLabel.NORTH);
        // butoane
        setMButton = new JButton("Set M");
        setMButton.setBounds(210, 165, 100, 50);
        setMButton.setFocusable(false);
        setMButton.addActionListener(this);

        rezButton = new JButton("Calculeaza");
        rezButton.setBounds(100, 270, 100, 50);
        rezButton.addActionListener(this);

        inapoiButton = new JButton("Inapoi");
        inapoiButton.setBounds(50, 350, 100, 50);
        inapoiButton.addActionListener(this);
        // adaugare butoane
        label.add(inapoiButton);
        panel.add(setMButton);
        panel.add(rezButton);
        // adaugare obiecte
        this.add(panel);
        this.add(cerinTextArea);
        this.add(puncteTextArea);
        this.add(label);
        // setarile generale ale frame-ului
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == setMButton) {
            problema4.setM(Integer.parseInt(mx.getText()), Integer.parseInt(my.getText()));
            punctMArea.setText(problema4.mtoString());
        }
        if (e.getSource() == rezButton) {
            problema4.rezSolutie();
        }
        if (e.getSource() == inapoiButton) {
            this.dispose();
            new MyFrame();
        }
    }
}
