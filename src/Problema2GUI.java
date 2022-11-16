
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Problema2GUI extends JFrame implements ActionListener{
    Problema2 problema2= new Problema2();
    JButton aButton,bButton,cButton,rezButton,inapoiButton;
    JTextField axfield,ayfield,bxfield,byfield,cxfield,cyfield,mxfield,myfield;
    JTextArea enuntArea,panA,panB,panC;
    JPanel panelA,panelB,panelC,desenPanel,calcFinal;
    JLabel label = new JLabel();
    ImageIcon iconImage= new ImageIcon("lib/problema2.jpg");
    Image newImage= iconImage.getImage().getScaledInstance(533, 300, Image.SCALE_SMOOTH);

    String coorA(){
        return "A("+problema2.getX(0)+","+problema2.getY(0)+")";
    }

    String coorB(){
        String s = "B("+problema2.getX(1)+","+problema2.getY(1)+")";
        return s;
    }

    String coorC(){
        return "C("+problema2.getX(2)+","+problema2.getY(2)+")";
    }

    Problema2GUI(){
        label.setIcon(new ImageIcon(newImage));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800,600);
        //textarea
        enuntArea= new JTextArea("   Localizarea in partitia indusa de un triunghi.\n   Se da triunghiul ABC prin coordonatele varfurilor A(a[x],a[y]),B(b[x],b[y]), C(c[x],c[y]).Se cere localizarea unui punct M dat prin coordonatel M(m[x],m[y]) in cadrul partitiei induse  de triunghiul ABC.");
        enuntArea.setBounds(0,0,800,100);
        enuntArea.setFont(new Font("Calibri", Font.PLAIN,20));
        enuntArea.setLineWrap(true);
        enuntArea.setEditable(false);
        enuntArea.setBackground(new Color(226,143,226));
        enuntArea.setWrapStyleWord(true);
        
        panA = new JTextArea(coorA());
        panA.setBounds(114,0,70,37);
        panA.setFont(new Font("Calibri",Font.PLAIN,20));
        panA.setBackground(Color.YELLOW);
        panA.setEditable(false);

        panB = new JTextArea(coorB());
        panB.setBounds(114,0,70,37);
        panB.setFont(new Font("Calibri",Font.PLAIN,20));
        panB.setBackground(Color.PINK);
        panB.setEditable(false);

        panC = new JTextArea(coorC());
        panC.setBounds(114,0,70,37);
        panC.setFont(new Font("Calibri",Font.PLAIN,20));
        panC.setBackground(Color.ORANGE);
        panC.setEditable(false);

        //panels
        panelA= new JPanel();
        panelA.setBounds(0,100,266,200);
        panelA.setLayout(null);
        panelA.setBackground(Color.YELLOW);
        panelA.setOpaque(true);

        panelB= new JPanel();
        panelB.setBounds(266,100,266,200);
        panelB.setLayout(null);
        panelB.setBackground(Color.PINK);
        panelB.setOpaque(true);

        panelC= new JPanel();
        panelC.setBounds(532,100,266,200);
        panelC.setLayout(null);
        panelC.setBackground(Color.ORANGE);
        panelC.setOpaque(true);

        calcFinal= new JPanel();
        calcFinal.setBounds(532,300,266,300);
        calcFinal.setLayout(null);
        calcFinal.setBackground(Color.cyan);
        calcFinal.setOpaque(true);

        desenPanel= new JPanel();
        desenPanel.setBounds(0,300,532,300);
        desenPanel.setBackground(Color.magenta);
        desenPanel.setOpaque(true);
        desenPanel.add(label);
        //butoane
        aButton= new JButton("<html>Seteaza <p> coordonatele lui A</html>");
        aButton.setBounds(83,125,110,50);
        aButton.setFocusable(false);
        aButton.addActionListener(this);

        bButton= new JButton("<html>Seteaza <p> coordonatele lui B</html>");
        bButton.setBounds(83,125,110,50);
        bButton.setFocusable(false);
        bButton.addActionListener(this);

        cButton= new JButton("<html>Seteaza<p>coordonatele lui C</html>");
        cButton.setBounds(83,125,110,50);
        cButton.setFocusable(false);
        cButton.addActionListener(this);
    
        rezButton= new JButton("Calculeaza!");
        rezButton.setBounds(83,125,110,50);
        rezButton.setFocusable(false);
        rezButton.addActionListener(this);

        inapoiButton= new JButton("<html>Inapoi in meniu<html>");
        inapoiButton.setBounds(100,200,110,50);
        inapoiButton.setFocusable(false);
        inapoiButton.addActionListener(this);

        //text fields
        axfield=new JTextField("0");
        axfield.setBounds(53,40,70,50);
        axfield.setFont(new Font("Calibri",Font.PLAIN,20));

        ayfield=new JTextField("0");
        ayfield.setFont(new Font("Calibri",Font.PLAIN,20));
        ayfield.setBounds(159,40,70,50);

        bxfield=new JTextField("0");
        bxfield.setFont(new Font("Calibri",Font.PLAIN,20));
        bxfield.setBounds(53,40,70,50);

        byfield=new JTextField("0");
        byfield.setFont(new Font("Calibri",Font.PLAIN,20));
        byfield.setBounds(159,40,70,50);

        cxfield=new JTextField("0");
        cxfield.setFont(new Font("Calibri",Font.PLAIN,20));
        cxfield.setBounds(53,40,70,50);

        cyfield=new JTextField("0");
        cyfield.setFont(new Font("Calibri",Font.PLAIN,20));
        cyfield.setBounds(159,40,70,50);

        mxfield=new JTextField("0");
        mxfield.setFont(new Font("Calibri",Font.PLAIN,20));
        mxfield.setBounds(53,40,70,50);

        myfield=new JTextField("0");
        myfield.setFont(new Font("Calibri",Font.PLAIN,20));
        myfield.setBounds(159,40,70,50);

        this.add(enuntArea);

        this.add(panelA);
        panelA.add(aButton);
        panelA.add(axfield);
        panelA.add(ayfield);
        panelA.add(panA);

        this.add(panelB);
        panelB.add(bButton);
        panelB.add(bxfield);
        panelB.add(byfield);
        panelB.add(panB);

        this.add(panelC);
        panelC.add(cButton);
        panelC.add(cxfield);
        panelC.add(cyfield);
        panelC.add(panC);

        this.add(calcFinal);
        calcFinal.add(rezButton);
        calcFinal.add(mxfield);
        calcFinal.add(myfield);
        calcFinal.add(inapoiButton);

        this.add(desenPanel);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {//aici e actiunea butoanelor
        if(e.getSource()== aButton){
            problema2.setA(Integer.parseInt(axfield.getText()),Integer.parseInt(ayfield.getText()));
            panA.setText(coorA());
        }
        if(e.getSource()== bButton){
            problema2.setB(Integer.parseInt(bxfield.getText()),Integer.parseInt(byfield.getText()));
            panB.setText(coorB());
        }
        if(e.getSource()== cButton){
            problema2.setC(Integer.parseInt(cxfield.getText()),Integer.parseInt(cyfield.getText()));
            panC.setText(coorC());
        }
        if(e.getSource()== rezButton){
             problema2.m[0]= Integer.parseInt(mxfield.getText());
             problema2.m[1]= Integer.parseInt(myfield.getText());
             int dMAB= problema2.Determinant(problema2.m[0],problema2.x[0],problema2.x[1],problema2.m[1],problema2.y[0],problema2.y[1]);
             int dMBC= problema2.Determinant(problema2.m[0],problema2.x[1],problema2.x[2],problema2.m[1],problema2.y[1],problema2.y[2]);
             int dMCA= problema2.Determinant(problema2.m[0],problema2.x[2],problema2.x[0],problema2.m[1],problema2.y[2],problema2.y[0]);
            if(problema2.Determinant(problema2.x[0], problema2.x[1], problema2.x[2], problema2.y[0], problema2.y[2], problema2.x[2])==0){
                JOptionPane.showMessageDialog(null,"Cele trei puncte sunt coliniare");
            }
            else if(problema2.Determinant(problema2.x[0], problema2.x[1], problema2.x[2], problema2.y[0], problema2.y[2], problema2.x[2])>0){
                         problema2.CazAbcMare(dMAB,dMBC,dMCA);
                     }
                else problema2.CazAbcMic(dMAB, dMBC, dMCA);
        }
        if(e.getSource()== inapoiButton){
            this.dispose();
            new MyFrame();
        }
    }
    
}
