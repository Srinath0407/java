import java.util.*;
class FibnocciseriesofEven
{
   public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int n1=0,n2=1,n3,num,sum=0,i;
        System.out.println("Enter the number : ");
        num=sc.nextInt(); 
        if(0>num)
        {
        System.out.printf("Invaild ");
        }
        else 
        {
         System.out.printf( "0 1 ");
        for(i=2;i<num;++i)
        {
         
            n3=n1+n2;
            n1=n2;
         System.out.printf( "%d  ",n3);
            if(i%2==0)
            {
            sum=sum+n3;
            }
            n2=n3;
        }
        }
        System.out.println("\nSum of even Fibonacci numbers till " + num + " is: " + sum);

    }
}