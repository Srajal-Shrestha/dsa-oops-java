public class StringComparison
{
  public static void main(String[] args) {
   
    String str1 = "Danfe";
    String str2 = "Danfe";

    System.out.println("Compare using == gives: "+ (str1==str2));
    System.out.println("Compare using equals gives: "+ str1.equals(str2));
    System.out.println("Compare using compareTo gives: "+ str1.compareTo(str2));

    String str3 = "danfe";
    System.out.println("Compare using equalsIngnoreCase gives: "+ str1.equalsIgnoreCase(str3));
  }
}
