import java.util.*;
class DisplayNumber_while
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,i=0;
        System.out.println("Enter the number : ");
        num=sc.nextInt();
        while(i<=num)
        {
            System.out.println(i);
            i++;
        }
    }
}