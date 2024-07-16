import java.util.*;
class Rectangle{

    public static void main(String args[])
    {
        Scanner Rectangle=new Scanner(System.in);
        double l,w,area;
        System.out.println("Enter the length : ");
        l=Rectangle.nextDouble();
        System.out.println("Enter the width: ");
        w=Rectangle.nextDouble();
        area=l*w;
        System.out.println("Area of Rectangle : "+area);
    }
}