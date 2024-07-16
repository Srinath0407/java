import java.util.*;
class SkippingKnumber
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter the value of M: ");
        int m = scanner.nextInt();
        System.out.println("Enter the value of N: ");
        int n = scanner.nextInt();
        System.out.println("Enter the value of K: ");
        int k = scanner.nextInt();
        for (int i = m; i <= n; i += k) {
            System.out.println(i + " ");
        }

    }
}