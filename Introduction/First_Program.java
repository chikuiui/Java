package Introduction;

class Point{
    int x;
    int y;
}

public class First_Program {
    public static void main(String []args){
        Point p = new Point();
        p.x = 10;
        p.y = 30;
        System.out.println(p.x +" " +p.y);
    }
}