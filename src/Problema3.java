import javax.swing.JOptionPane;

public class Problema3 {
    Point2D puncte[] = new Point2D[12];
    Point2D mPunct = new Point2D(6, 9);

    Problema3() {
        // A
        puncte[0] = new Point2D(8, 4);

        // B
        puncte[1] = new Point2D(7, 6);

        // C
        puncte[2] = new Point2D(6, 2);

        // D
        puncte[3] = new Point2D(6, 6);

        // E
        puncte[4] = new Point2D(2, 4);

        // F
        puncte[5] = new Point2D(0, 6);

        // G
        puncte[6] = new Point2D(-2, 2);

        // H
        puncte[7] = new Point2D(0, -2);

        // I
        puncte[8] = new Point2D(4, 0);

        // j
        puncte[9] = new Point2D(8, -1);

        // K
        puncte[10] = new Point2D(7, 1);

        // n+1
        puncte[11] = new Point2D(8, 4);

    }

    private int Determinant(Point2D a, Point2D b, Point2D c) {
        return a.getX() * (b.getY() - c.getY()) - b.getX() * (a.getX() - c.getY()) + c.getX() * (a.getY() - b.getY());
    }

    void Rezolvare() {
        int c = 0;
        Point2D A = new Point2D(0, 0);
        Point2D B = new Point2D(0, 0);
        for (int i = 0; i < 10; i++) {
            if (puncte[i].getY() == puncte[i + 1].getY() && mPunct.getY() == puncte[i + 1].getY()) {
                if (((mPunct.getX() - puncte[i].getX()) * (mPunct.getX() - puncte[i + 1].getX())) <= 0) {
                    JOptionPane.showMessageDialog(null, "M este pe frontiera");
                    return;
                }
            }
            if (puncte[i].getY() > puncte[i + 1].getY()) {
                A = puncte[i];
                B = puncte[i + 1];
            } else {
                A = puncte[i + 1];
                B = puncte[i];
            }
            if (puncte[i].getY() != puncte[i + 1].getY() && B.getY() < mPunct.getY() && mPunct.getY() < A.getY()) {
                if (Determinant(A, mPunct, B) > 0)
                    c++;
                else if (Determinant(A, mPunct, B) == 0) {
                    JOptionPane.showMessageDialog(null, "M este pe frontiera");
                    return;
                }
            }
            if (puncte[i].getY() != puncte[i + 1].getY() && mPunct.getY() >= puncte[i].getY()) {
                if (mPunct.getX() < A.getX())
                    c++;
                else if (mPunct.getX() > A.getX()) {
                    JOptionPane.showMessageDialog(null, "M este pe frontiera");
                    return;
                }
            }
            if (puncte[i].getY() != mPunct.getY() && mPunct.getY() == B.getY() && mPunct.getX() == B.getX()) {
                JOptionPane.showMessageDialog(null, "M este pe frontiera");
                return;
            }
        }
        if (c % 2 == 0) {
            JOptionPane.showMessageDialog(null, "M este in exterior");
        } else {
            JOptionPane.showMessageDialog(null, "M este in interior");
        }
    }

    public static void main(String[] args) {
        Problema3 pb3 = new Problema3();
        pb3.Rezolvare();
    }
}
