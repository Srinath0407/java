import java.util.*;
class fahrenheit
{
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double F,C;
        System.out.println("Enter the fahrenheit ");
        F=sc.nextDouble();
        C = (F - 32) * 5/9;
        System.out.println("fahrenheit to celsius  = "+C);
    }
}