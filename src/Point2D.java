
public class Point2D {
    private int x;
    private int y;
    private int cadran;
    //constructor
    Point2D(int px,int py){
        this.x=px;
        this.y=py;
    }
    //show
    public String toStringPunct(){
        String s="("+x+","+y+")";
        return s;
    }
    //setters
    public void setX(int n){
        this.x= n;
    }
    public void setY(int n){
        this.y= n;
    }
    public void setCadran(){
        this.cadran= cadran();
    }
    //getters
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getCadran(){
        return cadran;
    }
    //additions
    private int cadran(){
        if(x>0 && y>=0)
            return 1;
        else if(x<=0 && y>0)
            return 2;
        else if(x<0 && y<=0)
            return 3;
        else
            return 4;
    }
}
