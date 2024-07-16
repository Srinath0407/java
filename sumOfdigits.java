import java.util.*;
class sumOfdigits
{
    public static void main(String args[])
    {
      Scanner Sc=new Scanner(System.in);
     System.out.printf("Enter the class sum Of digits : ");
      int no=Sc.nextInt();
      int rev=0,rem=0;
      while(no!=0)
      {
        rem=no%10;
        rev=rev+rem;
        no=no/10;
      }
      
          System.out.println("It is not Amstrong number  : "+rev);
    }
}