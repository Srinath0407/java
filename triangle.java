import java.util.Scanner;
class triangle
{
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double b,h,area;
        System.out.println("Enter breadth = ");
        b=sc.nextDouble();
        System.out.println("Enter height = ");
        h=sc.nextDouble();
        area=(b*h)/2;
        System.out.println("triangle area = "+area);
    }
}
