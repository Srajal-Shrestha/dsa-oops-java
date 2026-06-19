class SumUsingCommandLineArgs
{
   public static void main(String args[])
   {
         //Input through command line or prompt
         int a = Integer.parseInt(args[0]);
         int b = Integer.parseInt(args[1]);

         //Processing
         int sum = a + b;
         //Output
         System.out.println("Sum using command line : "+sum);  
   }
}
