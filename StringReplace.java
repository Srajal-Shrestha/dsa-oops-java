import java.util.Scanner;
public class StringReplace{
public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);
    String name = "CAT";
    System.out.println("The word is " + name + "," + "So now Enter the two word as instructed below to make another meaningful word");
    System.out.print("Enter the letter to be replaced:");
    char a = sc.next().charAt(0);
    System.out.print("Enter the word to be replaced by:");
    char b = sc.next().charAt(0);
    String name2 = name.replace(a, b);
    System.out.println("New word:" + name2);
    sc.close();

    
    
}
}