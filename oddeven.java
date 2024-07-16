import java.util.*;
class oddeven
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int x;
        x=sc.nextInt();
        if(x%2==0)
        {
         System.out.println("It is even number "+x); 
        }
        else
        {
        System.out.println("Its is odd number "+x);
        }
        
    }
}