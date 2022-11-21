import javax.swing.JOptionPane;

public class Problema4 {
    private Point2D[] puncte = new Point2D[7];
    private Point2D m;
    private Point2D pOrig = new Point2D(0, 0);

    Problema4() {
        puncte[0] = new Point2D(-3, 2);
        puncte[1] = new Point2D(-1, 1);
        puncte[2] = new Point2D(-4, 5);
        puncte[3] = new Point2D(-2, 6);
        puncte[4] = new Point2D(2, 1);
        puncte[5] = new Point2D(4, 3);
        puncte[6] = new Point2D(2, 6);

        m = new Point2D(Integer.parseInt(JOptionPane.showInputDialog("X[m]=")),
                (Integer.parseInt(JOptionPane.showInputDialog("Y[m]="))));
    }

    // additions
    private int Determinant(Point2D a, Point2D b, Point2D c) {
        return a.getX() * (b.getY() - c.getY()) - b.getX() * (a.getX() - c.getY()) + c.getX() * (a.getY() - b.getY());
    }

    private void Cadran() {
        m.setCadran();
        for (int i = 0; i < puncte.length; i++) {
            puncte[i].setCadran();
        }
    }

    public void printArray() {
        for (int i = 0; i < puncte.length; i++) {
            System.out.println(puncte[i].toStringPunct());
        }
        System.out.println("\ncu M" + m.toStringPunct());
    }

    private void centruDeGreutate(Point2D a, Point2D b, Point2D c, int xs, int ys) {
        a.setX(a.getX() - xs);
        a.setY(a.getY() - ys);
        b.setX(b.getX() - xs);
        b.setY(b.getY() - ys);
        c.setX(c.getX() - xs);
        c.setY(c.getY() - ys);
    }

    private void redCentruDeGreutate(Point2D a, Point2D b, Point2D c, int xs, int ys) {
        a.setX(a.getX() + xs);
        a.setY(a.getY() + ys);
        b.setX(b.getX() + xs);
        b.setY(b.getY() + ys);
        c.setX(c.getX() + xs);
        c.setY(c.getY() + ys);
    }

    public String puncteToString() {
        char c = 'A';
        String s = 'A' + puncte[0].toStringPunct() + " ";
        c++;
        for (int i = 1; i < puncte.length; i++, c++) {
            s = s + c + puncte[i].toStringPunct() + " ";
        }
        return s;
    }

    public void setM(int n, int x) {
        m.setX(n);
        m.setY(x);
    }

    public String mtoString() {
        return "M(" + m.getX() + "," + m.getY() + ")";
    }

    private boolean equal(Point2D a, Point2D b) {
        if (a.getX() == b.getX() && a.getY() == b.getY()) {
            return true;
        } else
            return false;
    }

    // sortare si cautare binara
    private void merge(Point2D a[], int st, int mid, int dr) {
        int i, j, k;

        int n1 = mid - st + 1;
        int n2 = dr - mid;

        Point2D b[] = new Point2D[n1];
        Point2D c[] = new Point2D[n2];

        for (i = 0; i < n1; i++) {
            b[i] = a[st + i];
        }
        for (j = 0; j < n2; j++) {
            c[j] = a[mid + 1 + j];
        }

        i = 0;
        j = 0;
        k = st;

        while (i < n1 && j < n2) {
            if (b[i].getCadran() < c[j].getCadran()) {
                a[k] = b[i];
                i++;
            } else if (b[i].getCadran() > c[j].getCadran()) {
                a[k] = c[j];
                j++;
            } else {
                if (Determinant(b[i], pOrig, c[j]) >= 0) {
                    a[k] = c[j];
                    j++;
                } else {
                    a[k] = b[i];
                    i++;
                }
            }
            k++;
        }
        while (i < n1) {
            a[k] = b[i];
            i++;
            k++;
        }
        while (j < n2) {
            a[k] = c[j];
            j++;
            k++;
        }
    }

    private void sortareBinara(Point2D a[], int st, int dr) {
        if (st < dr) {
            int mid = st + (dr - st) / 2;

            sortareBinara(a, st, mid);
            sortareBinara(a, mid + 1, dr);

            merge(a, st, mid, dr);
        }
    }

    public void rezSolutie() {
        char c = 'A';
        for (int i = 0; i < puncte.length; i++) {
            if (equal(m, puncte[i]) == true) {
                JOptionPane.showMessageDialog(null, "M are aceleasi coordonate ca si punctul " + c);
                return;
            } else
                c++;
        }

        Cadran();

        sortareBinara(puncte, 0, puncte.length - 1);
        int i;
        for (i = 0; i < puncte.length; i++) {
            if (m.getCadran() == puncte[i].getCadran()) {
                if (Determinant(m, pOrig, puncte[i]) < 0)
                    break;
            }
            if (m.getCadran() < puncte[i].getCadran()) {
                break;
            }

        }
        if (i == puncte.length) {
            int xs = (m.getX() + puncte[0].getX() + puncte[i - 1].getX()) / 3;
            int ys = (m.getY() + puncte[0].getY() + puncte[i - 1].getY()) / 3;
            centruDeGreutate(m, puncte[0], puncte[i - 1], xs, ys);
            if (Determinant(m, puncte[0], puncte[i - 1]) > 0)
                JOptionPane.showMessageDialog(null, "M se afla in exterior!");
            else if (Determinant(m, puncte[0], puncte[i - 1]) < 0)
                JOptionPane.showMessageDialog(null, "M se afla in interior");
            else
                JOptionPane.showMessageDialog(null, "M se afla pe frontiera");
            redCentruDeGreutate(m, puncte[0], puncte[i - 1], xs, ys);
        } else if (i == 0) {
            int xs = (m.getX() + puncte[i].getX() + puncte[puncte.length - 1].getX()) / 3;
            int ys = (m.getY() + puncte[i].getY() + puncte[puncte.length - 1].getY()) / 3;
            centruDeGreutate(m, puncte[i], puncte[puncte.length - 1], xs, ys);
            if (Determinant(m, puncte[i], puncte[puncte.length - 1]) > 0)
                JOptionPane.showMessageDialog(null, "M se afla in exterior!");
            else if (Determinant(m, puncte[i], puncte[puncte.length - 1]) < 0)
                JOptionPane.showMessageDialog(null, "M se afla in interior");
            else
                JOptionPane.showMessageDialog(null, "M se afla pe frontiera");
            redCentruDeGreutate(m, puncte[i], puncte[puncte.length - 1], xs, ys);
        } else {
            int xs = (m.getX() + puncte[i].getX() + puncte[i - 1].getX()) / 3;
            int ys = (m.getY() + puncte[i].getY() + puncte[i - 1].getY()) / 3;
            centruDeGreutate(m, puncte[i], puncte[i - 1], xs, ys);
            if (Determinant(m, puncte[i], puncte[i - 1]) > 0)
                JOptionPane.showMessageDialog(null, "M se afla in exterior!");
            else if (Determinant(m, puncte[i], puncte[i - 1]) < 0)
                JOptionPane.showMessageDialog(null, "M se afla in interior");
            else
                JOptionPane.showMessageDialog(null, "M se afla pe frontiera");
            redCentruDeGreutate(m, puncte[i], puncte[i - 1], xs, ys);
        }
    }
}
