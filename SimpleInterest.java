class SimpleInterest {
      public static void main(String args[]) {
            // Input through command line or prompt
            double p = Double.parseDouble(args[0]);
            double t = Double.parseDouble(args[1]);
            double r = Double.parseDouble(args[2]);

            // Processing
            double si = (p * t * r) / 100;

            // Output
            System.out.println("Simple Interest =  " + si);
      }
}