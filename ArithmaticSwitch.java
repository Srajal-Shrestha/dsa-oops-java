import java.util.Scanner;
public class ArithmaticSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking 2 inputs from users;
        System.out.print("Enter the first integer number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second integer number: ");
        double num2 = sc.nextDouble();

        while (true) {
        //Giving choice options and asking command:
        System.out.println("Choice options:");
        System.out.println("a or A : Addition");
        System.out.println("s or S : Subtraction");
        System.out.println("m or M : Multiplication");
        System.out.println("d or D : Division");
        System.out.println("r or R : Reminder");
        
        System.out.print("Enter your choice: ");
        char choice = sc.next().charAt(0);

        //start switch case
        switch(choice) {
            case 'A':
                case 'a':
                    System.out.print("Result: " + (num1 + num2));
                    break;

                    case 'S':
                        case 's':
                            System.out.print("Result: " + (num1 - num2));
                            break;

                            case 'M' :
                            case 'm' :
                            System.out.print("Result: " + (num1 * num2));
                            break;

                            case 'D' :
                            case 'd' :
                            if (num2 != 0)
                            System.out.print("Result: " + (num1/num2));
                        else
                            System.out.print("Error: Division by 0.");
                            break;

                            case 'R' :
                            case 'r' :
                            System.out.println("Result: " + (num1 % num2));
                            break;

                            default:
                                System.out.println("Invalid choice: please try again!");
                                continue;

        }
        break;
    }
    sc.close();
    }
}