public class Pattern1 {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            int number = i * i; 

            for (int j = 1; j <= i; j++) {
                System.out.print(number + "\t");
                number += 2 * i - 1; 
            }

            System.out.println(); 
        }
    }
}