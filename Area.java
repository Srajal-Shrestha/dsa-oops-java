import java.util.Scanner;
class Area
{
    //Attributes
    double length, breadth;

    //Parameterized Constructor
    Area(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    double returnArea()
    {
        return this.length * this.breadth;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length and breadth: ");
        double len = input.nextDouble();
        double bre = input.nextDouble();
        
        //Class reference_variable = new constructor(Parameters/optional);
        Area a1 = new Area(len, bre);

        System.out.println("Area: " + a1.returnArea());
        //Closing Scanner
        .close();
    }
}