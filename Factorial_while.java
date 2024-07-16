 import java.util.*;
 class Factorial_while
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        byte n,fact=1;
        System.out.println("Enter the number : ");
        n=sc.nextByte();
        byte i=1;
       while(i<=n)
        {
            fact*=i;
            i++;
        }
       System.out.printf( " Factoriyal of number = %d ",fact);
    }
}