import java.util.*;
class leepyear
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the year : ");
        int year;
        year=sc.nextInt();
        {
        if(year%4==0)
        {
         System.out.println("It is leapyear "+year); 
        }
        else
        {
        System.out.println("Its is not leapyear "+year);
        }
        }
        
    }
}