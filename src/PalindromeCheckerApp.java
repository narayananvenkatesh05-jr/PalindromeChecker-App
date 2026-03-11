interface PalindromeStrategy{
    boolean check(String word);
}

class ReverseStrategy implements PalindromeStrategy{
    public boolean check(String word){
        return word.equals(new StringBuilder(word).reverse().toString());
    }
}

public class PalindromeCheckerApp{

    public static void main(String[] args){

        PalindromeStrategy strategy=new ReverseStrategy();

        System.out.println(strategy.check("madam")
                ?"Palindrome":"Not Palindrome");

    }
}