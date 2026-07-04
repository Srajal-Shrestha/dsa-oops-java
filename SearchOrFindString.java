public class SearchOrFindString
{
    public static void main(String[] args) {
       
        String str = "Java is my best programming language.";

        System.out.println("Search the first index of a = "+ str.indexOf("a"));
        System.out.println("Search the last index of a = "+ str.lastIndexOf("a"));

        System.out.println("Java contains in str or not = "+ str.contains("Java"));
    }
}