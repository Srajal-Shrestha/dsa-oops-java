import java.util.Scanner;
public class InputInJava {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //input int value 
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Your age is " + age);

        //input single string value
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.println("Your name is " + name);

        //this will print only token .it means .next() takes single word only so to print sentence need to use .nextLine()

        //input a sentence
        sc.nextLine(); // consume leftover newline
        System.out.println("Enter any sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Entered sentence: " + sentence);
        
    }
}