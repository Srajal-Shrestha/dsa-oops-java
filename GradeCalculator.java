import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.print("Enter marks for Subject 1: ");
        int sub1 = input.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int sub2 = input.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int sub3 = input.nextInt();

        // Calculating average
        double average = (sub1 + sub2 + sub3) / 3.0;

        // Display average
        System.out.println("Average marks: " + average);

        // Assigning grade
        if (average >= 80) {
            System.out.println("Grade: A");
        } else if (average >= 60) {
            System.out.println("Grade: B");
        } else if (average >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }

        input.close();
    }
}