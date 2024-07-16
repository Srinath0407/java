import java.util.*;
class ReversAnInteger
{
    public static void main(String args[])
    {
      Scanner Sc=new Scanner(System.in);
     System.out.printf("Enter the Integers : ");
      int no=Sc.nextInt();
      int rev=0,rem=0;

      while(no!=0)
      {
        rem=no%10;
        rev=rev*10+rem;
        no=no/10;
      }
      System.out.printf("Reverse An Integers : "+rev);
    }
}