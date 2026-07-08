class StudentFunction
{
    //Attributesn or characteristics or Data Members of Properties
    int roll;
    String name;
    String collage_name;

    //Methods or Function member or behaviour

void inputDetails(int r, String n, String c)
{
    roll = r;
    name = n;
    collage_name = c;
}
void outputDetails()
{
    System.out.println("\n ------------Student Details------------------");
    System.out.println("Roll :" + roll);
    System.out.println("Name:" + name);
    System.out.println("Collage: " + collage_name);   
}
public static void main(String[] args) {
    
    //Creating object of Student class
    StudentFunction obj = new StudentFunction();
    obj.inputDetails(1, "Srajal", "Danfe Collage");
    obj.outputDetails();
}
}
