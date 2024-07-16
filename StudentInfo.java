import java.util.Scanner;
class StudentInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Register Number: ");
        int regNumber = input.nextInt();

        System.out.print("Enter Name: ");
        String name = input.next();

        System.out.print("Enter Course Code: ");
        String courseCode = input.next();

        System.out.print("Enter Course Name: ");
        String courseName = input.next();

        System.out.print("Enter Test1 Mark: ");
        double test1Mark = input.nextDouble();

        System.out.println("Register Number: " + regNumber);
        System.out.println("Name: " + name);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Test1 Mark: " + test1Mark);

        input.close();
    }
}