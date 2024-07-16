 import java.util.*;
 class Palindrome {
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        int num , reversedNum = 0, remainder, x;
        System.out.println("Enter the number :");
        num=sc.nextInt();

        x = num;

        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
        if (x == reversedNum) {
            System.out.println(x+ " is a palindrome.");
        } else {
            System.out.println(x+ " is not a palindrome.");
        }
    }
}
