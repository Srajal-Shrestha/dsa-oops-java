import java.util.Scanner;
public class StringReplace2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String word = "DUCK";
        System.out.println("The word is " + word + "," + "So now enter single letter as instructed below to construct another meaningful word");
        System.out.print("Enter a letter to be replaced from given word:");
        char a = sc.next().charAt(0);
        System.out.print("Enter a letter to be replaced by:");
        char b = sc.next().charAt(0);
        String word2 = word.replace(a, b);
        System.out.println("New word: " + word2);
        sc.close();
    }

}