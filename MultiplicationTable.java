 import java.util.*;
class MultiplicationTable  

{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,i=0;
        System.out.println("Enter the number : ");
        num=sc.nextInt();
        do{
            System.out.println(i+" * "+num+" = "+(i*num));
            i++;
        }
        while(i<=10);
       
        
    }
}