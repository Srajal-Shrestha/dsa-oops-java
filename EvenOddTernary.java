import java.util.Scanner;

public class EvenOddTernary {
    public static void main(String[] args) {
        // Create a Scanner object to read keyboard input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Use the ternary operator to check if the number is even or odd
        String result = (number % 2 == 0) ? "Even" : "Odd";
        
        // Print the result
        System.out.println("The number " + number + " is " + result + ".");
        
        // Close the scanner
        scanner.close();
    }
}