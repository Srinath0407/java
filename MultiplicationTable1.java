import java.util.Scanner;

class MultiplicationTable1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Multiplication Table for " + num + ":");
        int i = 1;
        while ( i <= 10) {
            int result = num * i;
            i++;
            System.out.printf("%d * %d = %d%n", i, num, result);
        }

        
    }
}
