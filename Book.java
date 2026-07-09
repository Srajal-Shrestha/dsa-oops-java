import java.util.Scanner;
class Book
{
    //Attributes
    String title, author;
    double price;
    void inputDetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the book title:");
        title = sc.nextLine();
        System.out.println("Enter the book author:");
        author = sc.nextLine();
        System.out.println("Enter the book price:");
        price = sc.nextDouble();
        //Closing Scanner Object 
        sc.close();
    }
    void displayDetails () {
        System.out.println("\n ----Book Details");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.err.println("Price: " + price);
    }
    public static void main(String[] args);


}