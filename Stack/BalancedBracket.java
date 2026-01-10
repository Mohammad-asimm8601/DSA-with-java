package Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBracket {
    // Method - 1
    public static void count(String s){
        int openBracket = 0;
        int closeBracket = 0;
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            if(ch == '(') openBracket++;
            else closeBracket++;
        }
        System.out.println("Open bracket : "+openBracket);
        System.out.println("Close bracket : "+closeBracket);
    }
    // Method - 2
    public static boolean isBalancedBracket(String s ){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(') st.push(ch);
            else{
                if(st.isEmpty()) return false;
                st.pop();
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();    
            System.out.println(isBalancedBracket(s));
            count(s);
        }    
    }
}
