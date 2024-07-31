import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 153; 

        int originalNumber = number;
        int numDigits = 0;
        int result = 0;

        while (originalNumber != 0) {
            originalNumber /= 10;
            numDigits++;
        }

        originalNumber = number; 

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            result += Math.pow(digit, numDigits);
            originalNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }
}