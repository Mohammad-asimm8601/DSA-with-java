package recursion;

import java.util.Scanner;

public class GenerateParentheses {
    public static void parentheses(int open, int close, String s, int n){
        if(s.length() == 2*n){
            System.out.println(s);
            return;
        }
        if(open < n) parentheses(open+1, close, s+"(", n);
        if(close < open ) parentheses(open, close+1, s+")", n);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n :");
            int n  = sc.nextInt();
            parentheses(0, 0, "",  n);
        }
    }
}
