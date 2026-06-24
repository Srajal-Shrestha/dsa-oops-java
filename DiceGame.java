import java.util.Scanner;
import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("🎲 Dice Rolling Game");
        System.out.println("Press Enter to roll the dice...");
        input.nextLine(); // wait for Enter

        int userRoll = rand.nextInt(6) + 1;
        int computerRoll = rand.nextInt(6) + 1;

        System.out.println("You rolled: " + userRoll);
        System.out.println("Computer rolled: " + computerRoll);

        if (userRoll > computerRoll) {
            System.out.println("🎉 You win!");
        } else if (userRoll < computerRoll) {
            System.out.println("😢 Computer wins!");
        } else {
            System.out.println("😐 It's a draw!");
        }

        input.close();
    }
}