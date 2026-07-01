import java.util.Scanner;

class JaggedArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] num = new int[3][];
        //Define the column size
        num[0] = new int[2];
        num[1] = new int[3];
        num[2] = new int[4];

        //Input elements in 2D array
        for(int i=0; i<num.length; i++)
        {
            System.out.println("Enter "+ num[i].length + " elements at row "+ i );
            for(int j=0; j<num[i].length; j++)
            {
               num[i][j] = sc.nextInt();
            }
        }
        //Output
        System.out.println("Elements in jagged array are::: ");
        for(int i=0; i<num.length; i++)
        {
            for(int j=0; j<num[i].length; j++)
            {
               System.out.print(num[i][j] + "\t");
            }
            System.out.println();
        }
        //Close the scanner
        sc.close();
    }
}