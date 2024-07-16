import java.util.Scanner;
 class .
 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();
        
        System.out.print("Is customer senior citizen (y/n): ");
        char seniorCitizen = scanner.next().charAt(0);

        double roi = seniorCitizen == 'y' || seniorCitizen == 'Y' ? 0.12 : 0.10;
        double interest = principal * years * roi;
        System.out.println("Interest: " + interest);
    }
}

