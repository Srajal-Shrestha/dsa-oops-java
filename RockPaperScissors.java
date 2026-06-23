import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("🎮 Rock Paper Scissors Game");
        System.out.println("1 = Rock, 2 = Paper, 3 = Scissors");

        System.out.print("Enter your choice: ");
        int userChoice = input.nextInt();

        int computerChoice = rand.nextInt(3) + 1;

        System.out.println("Computer chose: " + computerChoice);

        if (userChoice == computerChoice) {
            System.out.println("It's a draw!");
        } else if (
            (userChoice == 1 && computerChoice == 3) ||
            (userChoice == 2 && computerChoice == 1) ||
            (userChoice == 3 && computerChoice == 2)
        ) {
            System.out.println("🎉 You win!");
        } else {
            System.out.println("😢 You lose!");
        }

        input.close();
    }
}