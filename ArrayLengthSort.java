import java.util.Scanner;
import java.util.Arrays;
public class ArrayLengthSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks obtained in Maths Science English in raw: ");
        int maths = sc.nextInt();
        int science = sc.nextInt();
        int english = sc.nextInt();

        int[] marks = new int[3];
        marks[0] = maths;
        marks[1] = science;
        marks[2] = english;
 
        //length
        //System.out.println("Array length: " + marks.length);
        //sort
        Arrays.sort(marks);
        System.out.println(marks[0]);
    }
}
