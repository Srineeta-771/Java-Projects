public class Rectangle
{
    double length;
    double breadth;
}

class RectangleDemo
{
    public static void main(String[] args)
    {
        Rectangle r1=new Rectangle();
        Rectangle r2=r1;
        r1.length=30;
        r2.length=10;
        System.out.println("r1: "+r1.length);
        System.out.println("r2: "+r2.length);
    }
}
