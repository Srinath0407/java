import java.util.*;
class SumofSeries_for
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        int i,sum=0;
        for(i=0;i<=num;i++)
        {
             sum=sum+i;
         }
         System.out.println("Enter the sum of series number : "+sum);
    }
}