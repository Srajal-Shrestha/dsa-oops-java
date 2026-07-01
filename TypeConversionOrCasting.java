public class TypeConversionOrCasting
{
    public static void main (String[] args)
    {
        int i = 4567;
        double d = i;
        System.out.println("Implicit type conversion = "+d);

        float f = 25.5f;
        int a = (int)f;
        System.out.println("Explicit type casting " +a);
    }
}