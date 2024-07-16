import java.util.*;
class posnegative
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
            int n1,n2,n3;
            System.out.println("Enter the number : ");
            n1=sc.nextInt();
        {
            if(n1>0)
            {
                System.out.println("Number is Positive");
            }
            else if(n1<0)
            {
                System.out.println("Number  is Negative");   
            }
            else
            {
                System.out.println("Number is Zero");
            }
        }   
    }
}