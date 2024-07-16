import java.util.*;
class Swap
{
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a,b;
        System.out.println("Enter a = ");
        a=sc.nextInt();
        System.out.println("Enter b = ");
        b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        
        System.out.println(" a = "+a);
        System.out.println(" b = "+b);
    }
}