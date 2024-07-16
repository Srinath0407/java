import java.util.*;
class MultiplicationTable_while  

{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,i=0;
        System.out.println("Enter the number : ");
        num=sc.nextInt();
        while(i<=10)
        {
            System.out.println(i+" * "+num+" = "+(i*num));
            i++;
        }
    }
}