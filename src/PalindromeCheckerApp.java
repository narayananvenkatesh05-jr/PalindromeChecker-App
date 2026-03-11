public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word="Never Odd Or Even";

        String clean=word.replaceAll("\\s+","").toLowerCase();

        String reversed=new StringBuilder(clean).reverse().toString();

        System.out.println(clean.equals(reversed)?"Palindrome":"Not Palindrome");

    }
}