import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Problema1 {
    
    public ArrayList<Integer> a= new ArrayList<>();
    public ArrayList<Integer> b= new ArrayList<>();
    public ArrayList<Integer> c = new ArrayList<>();


    void Coliniar(ArrayList<Integer> A,ArrayList<Integer> D, ArrayList<Integer> C,int lungA, int lungB, int lungC){
        int i,j,k,l,E[]= new int[lungC],c=0;
        for(i=0;i<lungA;i++){
            for(j=0;j<lungC;j++){
                E[j]= A.get(i)+C.get(j);
                }
                l=0;k=0;
                while(l< lungC && k < lungB)
                {
                    if(D.get(k)== E[l]){
                        String s =String.valueOf(A.get(i)) + "," + D.get(k)/2 + "," + String.valueOf(E[l]-A.get(i));
                        JOptionPane.showMessageDialog(null,s +" sunt coliniare\n");
                        k++;
                        c++;
                        }
                    if(D.get(k)< E[l])
                        k++;
                    if(D.get(k)>E[l])
                        l++;
                }
        }
        if(c==0)
            JOptionPane.showMessageDialog(null,"Nu exista a[i],b[j],c[k] coliniare");
    }
}
