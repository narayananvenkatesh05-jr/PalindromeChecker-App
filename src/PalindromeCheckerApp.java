class PalindromeService{

    boolean check(String word){
        String rev=new StringBuilder(word).reverse().toString();
        return word.equals(rev);
    }
}

public class PalindromeCheckerApp{

    public static void main(String[] args){

        PalindromeService service=new PalindromeService();

        System.out.println(service.check("madam")
                ?"Palindrome":"Not Palindrome");

    }
}