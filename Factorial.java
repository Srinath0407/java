 import java.util.*;
 class Factorial
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        byte n,fact=1;
        System.out.println("Enter the number : ");
        n=sc.nextByte();
        for(byte i=1;i<=n;i++)
        {
            fact*=i;
            
        }
       System.out.printf(" Factoriyal of number = %d ",fact);
    }
}