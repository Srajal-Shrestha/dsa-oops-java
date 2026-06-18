import java.util.Scanner;

public class GreatestUsingArray {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int[] num = new int[10];

        //input element in 1d array
        System.out.print("Enter any ten numbers: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
    //process to find greatest
    int greatest = num[0];
    for (int i = 1 ; i < num.length; i++) {
        if (num[i] > greatest) {
            greatest = num[i];
        }
    }
    System.out.println("Greatest number: " + greatest) ;
    }
}
