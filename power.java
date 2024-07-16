import java.util.*;
class power
{
    public static void main(String args[])
    {
        Scanner pow=new Scanner(System.in);
        System.out.println("Enter number : ");
        double num;
        num=pow.nextDouble();
        double square = Math.pow(num, 2);
        System.out.println("Enter square : "+square);
        double cube=Math.pow(num,3);
        System.out.println("Enter square : "+cube);
        double forth=Math.pow(num,4);
        System.out.println("Enter forth power : "+forth);
        
    }

}