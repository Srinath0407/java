import java.util.*;
class greatestNumber 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
            int n1,n2,n3;
            System.out.println("Enter the number 1 : ");
            n1=sc.nextInt();
            System.out.println("Enter the number 2 : ");
            n2=sc.nextInt();
            System.out.println("Enter the number 3 : ");
            n3=sc.nextInt();
        {
            if(n1>n2&&n1>n3)
            {
                System.out.println("Number 1 is greatest");
            }
            else if(n2>n1&&n2>n3)
            {
                System.out.println("Number 2 is greatest");   
            }
            else
            {
                System.out.println("Number 3 is greatest");
            }
        }   
    }
}