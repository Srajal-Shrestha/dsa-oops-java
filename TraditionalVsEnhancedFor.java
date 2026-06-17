public class TraditionalVsEnhancedFor {
    public static void main(String[] args) {
        int num[] = {10, 20, 45, 37, 78,30};

        System.out.println("Traditional for loop: ");
        for(int i = 0; i < num.length; i++)
        {
            System.out.print(num[i]+ "\t");
        }

        System.out.println("\nEnhanced for loop::: ");
        for(int a : num)
        {
            System.out.print(a+ "\t");
        }


    }
}