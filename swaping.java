import java.util.*;

class swaping
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a,b,tem;
        tem=0;
        System.out.println("Enter a ");
        a=sc.nextDouble();
        System.out.println("Enter b ");
        b=sc.nextDouble();
        tem=a;
        a=b;
        b=tem;
        System.out.println(" a = "+a);
        System.out.println(" b = "+b);
    }
}