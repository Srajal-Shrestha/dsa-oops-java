class FactorialFinder {
    //non static method 
    // if you want to access non static memeber of the class than object is necessary .
    //
    static int factorial(int n)
    {
        //1. Base case or stopping condition

        if (n == 0 || n == 1)  //n < 1
        return 1;
        // //2. Recursive case or self calling
        return n * factorial(n - 1);



    }
    public static void main(String[] args) {
        //by creating object
        //FactorialFinder obj = new FactorialFinder();

        //without object
        int n =  5;
        int result = factorial(n);
        System.out.println("Factorial of " + n + " = " + result);




    }

}