import java.util.*;
class Fibonacci_do_while

{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=0,n2=1,n3,num,i=2;
        System.out.println("Enter the number : ");
        num=sc.nextInt();
        System.out.print(n1+" "+n2);
     do
        {
            n3=n1+n2;   
             System.out.print(" "+n3);
            n1=n2;
            n2=n3;
            ++i;

        }        while(i<num);
    }
}