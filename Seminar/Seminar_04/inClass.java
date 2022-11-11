package Seminar.Seminar_04;

public class inClass {
    public static void main(String[] args) {
        Point2D a = new Point2D(1,2);
        System.out.println(a);
    }
}

class Point2D{
    private int x,y;
    public Point2D(int x, int y){
        this.x = x;
        this.y = y;

    }
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
    @Override
    public String toString(){
        return String.format("x = %d y = %d", x,y);
    }
}
