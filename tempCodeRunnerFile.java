import javax.swing.JOptionPane;

public class Problema4 {
    int x[],y[];
    int cad[];
    int m;
    Problema4(int n){
        x= new int[n+1];
        y= new int[n+1];
        cad= new int[n+1];
        for(int i=0;i<n;i++){
            x[i]=Integer.parseInt(JOptionPane.showInputDialog("X["+(i+1)+"]="));
            y[i]=Integer.parseInt(JOptionPane.showInputDialog("Y["+(i+1)+"]="));
        }
        x[n]=Integer.parseInt(JOptionPane.showInputDialog("M[x]="));
        y[n]=Integer.parseInt(JOptionPane.showInputDialog("M[y]="));
        m=x[n];
    }

    public void merge(int[] arrx,int[] arry,int cadr[],int st,int mid,int dr){
        int i,j,k;
        int n1=mid-st;
        int n2=dr-mid;

        int xSt[]=new int[n1],ySt[]=new int[n1],cSt[]=new int[n1];
        int xDr[]=new int[n2],yDr[]=new int[n2],cDr[]=new int[n2];

        for(i=0;i<n1;i++){
            xSt[i]=arrx[st+1];
            ySt[i]=arry[st+1];
            cSt[i]=cadr[st+1];
        }
        for(j=0;j<n2;j++){
            xSt[j]=arrx[mid+1+j];
            ySt[j]=arry[mid+1+j];
            cSt[j]=cadr[mid+1+j];
        }
        i=0;j=0;k=st;

        while(i<n1 && j<n2){
            if(cSt[i]<cDr[j]){
                arrx[k]=xSt[i];
                arry[k]=ySt[i];
                cadr[k]=cSt[i];
                i++;
            }else if(cSt[i]>cDr[j]){
                arrx[k]=xDr[i];
                arry[k]=yDr[i];
                cadr[k]=cDr[i];
                j++;
            }
            else{
                if(Determinant(xDr[i],0,xSt[i], xDr[i], 0, yDr[i])>0){
                    arrx[k]=xDr[i];
                    arry[k]=yDr[i];
                    cadr[k]=cDr[i];
                    j++;
                }
            }
            k++;
            while(i<n1){
                arrx[k]=xSt[i];
                arry[k]=ySt[i];
                cadr[k]=cSt[i];
                i++;
                k++; 
            }
            while(j<n2){
                arrx[k]=xDr[i];
                arry[k]=yDr[i];
                cadr[k]=cDr[i];
                j++;
                k++;
            }
        }
    }
    public void biMerge(int Arrx[],int Arry[],int ArrC[],int st,int dr){
        if(st<dr){
            int mid = st+(dr-st)/2;

            biMerge(Arrx, Arry, ArrC, st, mid);
            biMerge(Arrx, Arry, ArrC, mid+1, dr);

            merge(Arrx, Arry, Arry, st, mid, dr);
        }
    }

    public void inOutFr(){
        Cadran();
        biMerge(x, y, cad, 0, x.length);
        int i;
        for(i=0;i<x.length;i++){
            if(m==x[i])
                break;
        }
        if(i==0){
            if(Determinant(x[x.length-1], x[i], x[i+1], y[y.length-1], y[i], y[i+1])>0)
                JOptionPane.showConfirmDialog(null, "Punctul M este in exterior");
            if(Determinant(x[x.length-1], x[i], x[i+1], y[y.length-1], y[i], y[i+1])<0)
                JOptionPane.showConfirmDialog(null, "Punctul M este in interior");
            else 
                JOptionPane.showConfirmDialog(null, "Punctul M este pe frontiera");
        }
        else if(i==x.length-1){
            if(Determinant(x[i-1], x[i], x[0], y[i-1], y[i], y[0])>0)
                JOptionPane.showConfirmDialog(null, "Punctul M este in exterior");
            if(Determinant(x[i-1], x[i], x[0], y[i-1], y[i], y[0])<0)
                JOptionPane.showConfirmDialog(null, "Punctul M este in interior");
            else 
                JOptionPane.showConfirmDialog(null, "Punctul M este pe frontiera");
        }
        else
            if(Determinant(x[i-1], x[i], x[i+1], y[i-1], y[i], y[i+1])>0)
                JOptionPane.showConfirmDialog(null, "Punctul M este in exterior");
            if(Determinant(x[i-1], x[i], x[i+1], y[i-1], y[i], y[i+1])<0)
                JOptionPane.showConfirmDialog(null, "Punctul M este in interior");
            else 
                JOptionPane.showConfirmDialog(null, "Punctul M este pe frontiera");
    }

    public void Cadran(){
        if(x.length-1>3){
            int xs=(x[0]+x[1]+x[2])/3;
            int ys=(y[0]+y[1]+y[2])/3;
            for(int i=0;i<x.length;i++){
                x[i]-=xs;
                y[i]-=ys;
                cad[i]=cadran(x[i], y[i]);
            }
        }
    }

    public static int cadran(int x,int y){
        if(x>0 && y>=0)
            return 1;
        else if(x<=0 && y>0)
            return 2;
        else if(x<0 && y<=0)
            return 3;
        return 4;
    }

    public String xytoString(int i){
        return "("+x[i]+","+y[i]+")";
    }

    public static int Determinant(int Ax, int Bx, int Cx,int Ay,int By,int Cy)
    {
        return Ax*(By-Cy)-Bx*(Ay-Cy)+Cx*(Ay-By);
    }
    public static void main(String[] args){
        Problema4 problema4=new Problema4(4);
        problema4.inOutFr();
    }
}
