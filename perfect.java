import java.util.*;
class perfect
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        int per=0,i=1;
        while(i<num)
        {
            if(n%i==0)
            {
                per+=i;
            }
            i++;
        }

        if(num==per)
            System.out.println("It is perfect number "+num);
        else
            System.out.println("It is not perfect number "+num);
    }
    
}