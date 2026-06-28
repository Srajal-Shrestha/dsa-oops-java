import java.util.ArrayList;
import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<BankAccount> accounts = new ArrayList<>();

        // Pre-created users
        accounts.add(new BankAccount("Ram", 1000));
        accounts.add(new BankAccount("Shyam", 2000));

        System.out.println("👥 Welcome to Multi-User Bank");

        // Select user
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println((i + 1) + ". " + accounts.get(i).getName());
        }

        System.out.print("Select account: ");
        int index = input.nextInt() - 1;

        if (index < 0 || index >= accounts.size()) {
            System.out.println("Invalid selection");
            return;
        }

        BankAccount account = accounts.get(index);

        int choice;

        do {
            System.out.println("\n🏦 Menu for " + account.getName());
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    account.deposit(input.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    account.withdraw(input.nextDouble());
                    break;

                case 3:
                    System.out.println("Balance: " + account.getBalance());
                    break;

                case 4:
                    System.out.println("Goodbye 👋");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        input.close();
    }
}