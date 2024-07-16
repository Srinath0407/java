import java.util.*;
class SumofSeries
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        int i=0,sum=0;
        while(i<=num)
        {
             sum=sum+i;
             i++;
         }
         System.out.println("Enter the sum of series number : "+sum);
    }
}
