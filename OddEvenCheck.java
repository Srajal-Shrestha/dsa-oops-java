import java.util.Scanner;
class OddEvenCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();

        String result = (num%2 == 0) ? "Even" : "Odd";

        System.out.println("The given number is: " + result );
        sc.close();
        
        
    }
}