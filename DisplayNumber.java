import java.util.*;
class DisplayNumber
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,i=0;
        System.out.println("Enter the number : ");
        num=sc.nextInt();
        do{
            System.out.println(i);
            i++;
        }
        while(i<=num);
       
        
    }
}