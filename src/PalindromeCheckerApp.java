package Main;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";
        char[] arr = word.toCharArray();

        boolean palindrome = true;

        for(int i=0;i<arr.length/2;i++){
            if(arr[i] != arr[arr.length-1-i]){
                palindrome = false;
                break;
            }
        }

        System.out.println(palindrome ? "Palindrome" : "Not Palindrome");

    }
}