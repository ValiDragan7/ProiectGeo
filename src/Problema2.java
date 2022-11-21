import javax.swing.JOptionPane;

public class Problema2 {
    public int x[] = new int[3];
    public int y[] = new int[3];
    public int m[] = new int[2];

    int Determinant(int Ax, int Bx, int Cx, int Ay, int By, int Cy) {
        return Ax * (By - Cy) - Bx * (Ay - Cy) + Cx * (Ay - By);
    }

    void CazAbcMare(int dMAB, int dMBC, int dMCA) {
        if (dMAB > 0 && dMBC > 0 && dMCA > 0)
            JOptionPane.showMessageDialog(null, "Punctul M este in interiorul triunghiului");
        if (dMAB < 0 && dMBC > 0 && dMCA < 0)
            JOptionPane.showMessageDialog(null, "Punctul M este in afara triunghiului in partitia 2");
        if (dMAB < 0 && dMBC < 0 && dMCA > 0)
            JOptionPane.showMessageDialog(null, "Punctul M este in afara triunghiului in partitia 3");
        if (dMAB > 0 && dMBC < 0 && dMCA < 0)
            JOptionPane.showMessageDialog(null, "Punctul M este in afara triunghiului in partitia 4");
        if (dMAB > 0 && dMBC < 0 && dMCA > 0)
            JOptionPane.showMessageDialog(null, "Punctul M este in afara triunghiului in partitia 5");
        if (dMAB > 0 && dMBC > 0 && dMCA < 0)
            JOptionPane.showMessageDialog(null, "Punctul M este in afara triunghiului in partitia 6");
        if (dMAB < 0 && dMBC > 0 && dMCA > 0)
            JOptionPane.showMessageDialog(null, "Punctul M este in afara triunghiului in partitia 7");
        ;
        if (dMAB > 0 && dMBC > 0 && dMCA == 0)
            JOptionPane.showMessageDialog(null, "Punctul M este pe frontiera dintre 1 si 5");
        if (dMAB > 0 && dMBC == 0 && dMCA > 0)
            JOptionPane.showMessageDialog(null, "Punctul M este pe frontiera dintre 1 si 6");
        if (dMAB == 0 && dMBC > 0 && dMCA > 0)
            JOptionPane.showMessageDialog(null, "Punctul M este pe frontiera dintre 1 si 7");
        if (dMAB == 0 && dMBC > 0 && dMCA < 0)
            JOptionPane.showMessageDialog(null, "Punctul M este pe frontiera dintre 2 si 6");
        if (dMAB < 0 && dMBC > 0 && dMCA == 0)
            JOptionPane.showMessageDialog(null, "Punctul M este pe frontiera dintre 2 si 7");
        if (dMAB < 0 && dMBC == 0 && dMCA > 0)
            JOptionPane.showMessageDialog(null, "Punctul M este pe frontiera dintre 3 si 7");
        if (dMAB == 0 && dMBC < 0 && dMCA > 0)
            JOptionPane.showMessageDialog(null, "Punctul M este pe frontiera dintre 3 si 5");
        if (dMAB > 0 && dMBC < 0 && dMCA == 0)
            JOptionPane.showMessageDialog(null, "Punctul M este pe frontiera dintre 4 si 5");
        if (dMAB > 0 && dMBC == 0 && dMCA < 0)
            JOptionPane.showMessageDialog(null, "Punctul M este pe frontiera dintre 4 si 6");
        if (dMAB == 0 && dMBC > 0 && dMCA == 0)
            JOptionPane.showMessageDialog(null, "Punctul M are aceleasi coordonate ca si punctul A");
        if (dMAB == 0 && dMBC == 0 && dMCA > 0)
            JOptionPane.showMessageDialog(null, "Punctul M are aceleasi coordonate ca si punctul B");
        if (dMAB > 0 && dMBC == 0 && dMCA == 0)
            JOptionPane.showMessageDialog(null, "Punctul M are aceleasi coordonate ca si punctul C");
    }

    void CazAbcMic(int dMAB, int dMBC, int dMCA) {
        if (dMAB < 0 && dMBC < 0 && dMCA < 0)
            JOptionPane.showMessageDialog(null, "Punctul M este in interiorul triunghiului");
        if (dMAB > 0 && dMBC < 0 && dMCA > 0)
            JOptionPane.showMessageDialog(null, "Punctul M este in afara triunghiului in partitia 2");
        if (dMAB < 0 && dMBC > 0 && dMCA > 0)
            JOptionPane.showMessageDialog(null, "Punctul M este in afara triunghiului in partitia 3");
        if (dMAB > 0 && dMBC > 0 && dMCA < 0)
            JOptionPane.showMessageDialog(null, "Punctul M este in afara triunghiului in partitia 4");
        if (dMAB < 0 && dMBC > 0 && dMCA < 0)
            JOptionPane.showMessageDialog(null, "Punctul M este in afara triunghiului in partitia 5");
        if (dMAB > 0 && dMBC < 0 && dMCA < 0)
            JOptionPane.showMessageDialog(null, "Punctul M este in afara triunghiului in partitia 6");
        if (dMAB < 0 && dMBC < 0 && dMCA > 0)
            JOptionPane.showMessageDialog(null, "Punctul M este in afara triunghiului in partitia 7");
        ;
        if (dMAB < 0 && dMBC == 0 && dMCA < 0)
            JOptionPane.showMessageDialog(null, "Punctul M este pe frontiera dintre 1 si 5");
        if (dMAB == 0 && dMBC < 0 && dMCA < 0)
            JOptionPane.showMessageDialog(null, "Punctul M este pe frontiera dintre 1 si 6");
        if (dMAB < 0 && dMBC < 0 && dMCA == 0)
            JOptionPane.showMessageDialog(null, "Punctul M este pe frontiera dintre 1 si 7");
        if (dMAB > 0 && dMBC < 0 && dMCA == 0)
            JOptionPane.showMessageDialog(null, "Punctul M este pe frontiera dintre 2 si 6");
        if (dMAB == 0 && dMBC < 0 && dMCA > 0)
            JOptionPane.showMessageDialog(null, "Punctul M este pe frontiera dintre 2 si 7");
        if (dMAB < 0 && dMBC == 0 && dMCA > 0)
            JOptionPane.showMessageDialog(null, "Punctul M este pe frontiera dintre 3 si 7");
        if (dMAB < 0 && dMBC > 0 && dMCA == 0)
            JOptionPane.showMessageDialog(null, "Punctul M este pe frontiera dintre 3 si 5");
        if (dMAB == 0 && dMBC > 0 && dMCA < 0)
            JOptionPane.showMessageDialog(null, "Punctul M este pe frontiera dintre 4 si 5");
        if (dMAB > 0 && dMBC == 0 && dMCA < 0)
            JOptionPane.showMessageDialog(null, "Punctul M este pe frontiera dintre 4 si 6");
        if (dMAB == 0 && dMBC < 0 && dMCA == 0)
            JOptionPane.showMessageDialog(null, "Punctul M are aceleasi coordonate ca si punctul A");
        if (dMAB == 0 && dMBC == 0 && dMCA < 0)
            JOptionPane.showMessageDialog(null, "Punctul M are aceleasi coordonate ca si punctul B");
        if (dMAB < 0 && dMBC == 0 && dMCA == 0)
            JOptionPane.showMessageDialog(null, "Punctul M are aceleasi coordonate ca si punctul C");
    }

    public void setA(int x, int y) {
        this.x[0] = x;
        this.y[0] = y;
    }

    public void setB(int x, int y) {
        this.x[1] = x;
        this.y[1] = y;
    }

    public void setC(int x, int y) {
        this.x[2] = x;
        this.y[2] = y;
    }

    public void setM(int x, int y) {
        this.m[0] = x;
        this.m[1] = y;
    }

    public int getX(int a) {
        return x[a];
    }

    public int getY(int a) {
        return y[a];
    }
}