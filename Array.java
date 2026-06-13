import java.util.Arrays;
public class Array {
    public static void main(String[] args){
        int physics = 87;
        int maths = 97;
        int chem = 96;

        int[] marks = new int[3];
        marks[0] = 98;
        marks[1] = 97;
        marks[2] = 96;
        //Length
        /// System.out.println(marks.length);
        //sort
        /// System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);
        
    }
}