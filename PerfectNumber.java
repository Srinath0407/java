import java.util.Scanner;

class PerfectNumber {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        long number=scanner.nextLong();

        long sumOfdivisors = 0;
        long i = 1;
        while ( i <= number / 2) {
            if (number % i == 0) {
                sumOfdivisors += i;
                i++;
            }
        }

        if (sumOfdivisors == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        
    }
}
