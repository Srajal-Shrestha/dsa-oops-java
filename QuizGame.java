import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int score = 0;

        System.out.println(" Welcome to the Quiz Game!");
        System.out.println("----------------------------");

        // Question 1
        System.out.println("1. What is the capital of Nepal?");
        System.out.println("1. Pokhara");
        System.out.println("2. Kathmandu");
        System.out.println("3. Lalitpur");
        System.out.println("4. Biratnagar");
        int ans1 = input.nextInt();

        if (ans1 == 2) {
            System.out.println("Correct! ");
            score++;
        } else {
            System.out.println("Wrong ");
        }

        // Question 2
        System.out.println("\n2. Which language is used in Java?");
        System.out.println("1. Machine Code");
        System.out.println("2. Assembly");
        System.out.println("3. Bytecode");
        System.out.println("4. Binary");
        int ans2 = input.nextInt();

        if (ans2 == 3) {
            System.out.println("Correct! ");
            score++;
        } else {
            System.out.println("Wrong ");
        }

        // Question 3
        System.out.println("\n3. Which keyword is used to create a class in Java?");
        System.out.println("1. function");
        System.out.println("2. define");
        System.out.println("3. class");
        System.out.println("4. new");
        int ans3 = input.nextInt();

        if (ans3 == 3) {
            System.out.println("Correct! ");
            score++;
        } else {
            System.out.println("Wrong ");
        }

        // Final Score
        System.out.println("\n Your final score: " + score + "/3");

        if (score == 3) {
            System.out.println(" Excellent!");
        } else if (score == 2) {
            System.out.println(" Good job!");
        } else {
            System.out.println(" Keep practicing!");
        }

        input.close();
    }
}