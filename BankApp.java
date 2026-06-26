import java.util.Scanner;

class BankAccount {
    double balance;

    // Constructor
    BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Deposit method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Display balance
    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BankAccount account = new BankAccount(1000); // starting balance

        int choice;

        do {
            System.out.println("\nBanking Menu");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    double dep = input.nextDouble();
                    account.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double wd = input.nextDouble();
                    account.withdraw(wd);
                    break;

                case 3:
                    account.showBalance();
                    break;

                case 4:
                    System.out.println("Goodbye ");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        input.close();
    }
}