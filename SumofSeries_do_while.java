import java.util.*;
class SumofSeries_do_while
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        int i=0,sum=0;
        do
        {
             sum=sum+i;
             i++;
         }
         while(i<=num);
         System.out.println("Enter the sum of series number : "+sum);
    }
}