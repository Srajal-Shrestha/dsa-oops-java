public class Circle {


    final double PI = 3.14159;
    double radius;


    void setData(double r) {
        radius = r;
    }


    double calculateArea() {
        return PI * radius * radius;
    }


    public static void main(String[] args) {


        Circle c = new Circle();


        c.setData(7.0);


        System.out.println("================================");
        System.out.println("         CIRCLE CALCULATOR      ");
        System.out.println("================================");
        System.out.println("PI           = " + c.PI);
        System.out.println("Radius       = " + c.radius);
        System.out.println("Area         = " + c.calculateArea());
        System.out.println("================================");
    }
}