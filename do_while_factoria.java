import java.util.*;
 class do_while_factoria
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        byte n,fact=1;
        System.out.println("Enter the number : ");
        n=sc.nextByte();
        byte i=1;
     do
        {
            fact*=i;
            i++;
        }  while(i<=n);
       System.out.printf( " Factoriyal of number = %d ",fact);
    }
}