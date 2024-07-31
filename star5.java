import java.util.Scanner;

class star5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the pyramid: ");
        int numRows = scanner.nextInt();

        for (int i = 0; i < numRows; i++) {
            for (int j = numRows - i; j > 1; j--) {
                System.out.print(" "); 
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* "); 
            }
            System.out.println(); 
        }

    }
}
