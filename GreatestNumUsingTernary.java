import java.util.Scanner;
public class GreatestNumUsingTernary  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Take user input;
        System.out.println("Enter any three integer number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        //checking greater among three number using ternary or conditional operator;
        int greatest = (a > b) ? ((a > c)? a : c) : ((b > c)? b : c);

        //output
        System.out.println("The greatest number is: " + greatest);

        //close scanner
        sc.close();

    }
}