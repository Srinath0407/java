import java.util.Scanner;
class Series1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter N value: ");
        int n = scan.nextInt();

        int sum = 0;
        int i = 1;
        while ( i <= n) {
            sum += i;
            i++;
        }

        System.out.println("Sum = " + sum);
    }
}
