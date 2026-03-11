import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word="madam";

        Stack<Character> stack=new Stack<>();
        Queue<Character> queue=new LinkedList<>();

        for(char c:word.toCharArray()){
            stack.push(c);
            queue.add(c);
        }

        boolean palindrome=true;

        while(!stack.isEmpty()){
            if(stack.pop()!=queue.remove()){
                palindrome=false;
                break;
            }
        }

        System.out.println(palindrome?"Palindrome":"Not Palindrome");

    }
}