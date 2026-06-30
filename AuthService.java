import java.util.ArrayList;
import java.util.Scanner;

class AuthService {
    private ArrayList<User> users = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public void start() {
        int choice;

        do {
            System.out.println("\n--- Login System ---");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    register();
                    break;

                case 2:
                    login();
                    break;

                case 3:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 3);
    }

    private void register() {
        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        users.add(new User(username, password));
        System.out.println("User registered!");
    }

    private void login() {
        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        for (User user : users) {
            if (user.getUsername().equals(username) && user.checkPassword(password)) {
                System.out.println(" Login successful!");
                return;
            }
        }

        System.out.println(" Invalid username or password");
    }
}