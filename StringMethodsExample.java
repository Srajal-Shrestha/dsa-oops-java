//import.java.util.Scanner;
public class StringMethodsExample {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
       //Assign value using string 
       String str = "Danfe Collage";
             System.out.println("Total length = "+ str.length());
        System.out.println("Uppercase = "+ str.toUpperCase());
        System.out.println("Lowercase = "+ str.toLowerCase());
        System.out.println("Character at index 4 = "+ str.charAt(4));

        String newStr  = str.concat(" is best college.");
        System.out.println(newStr);
        System.out.println("Substring = "+ str.substring(6, 13));

        System.out.println("Replace college by campus = "+ newStr.replace("college","campus"));
       
        String abc = "         Hello          ";
        System.out.println("Orginal value of abc = "+abc);
        System.out.println("Trimmed value of abc = "+ abc.trim());
    }
}

