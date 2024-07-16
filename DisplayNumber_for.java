import java.util.*;
class DisplayNumber_for
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,i=0;
        System.out.println("Enter the number : ");
        num=sc.nextInt();
        for(i=0;i<=num;i++)
        {
            System.out.println(i);
        }
    }
}