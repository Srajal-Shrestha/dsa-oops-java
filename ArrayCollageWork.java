import java.util.Scanner;
public class ArrayCollageWork {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        //input element in 1d array
        System.out.print("Enter any ten numbers: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        //output
        System.out.println("Accessing array elements using for loop");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        sc.close();
    }
}