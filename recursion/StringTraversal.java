// Remove all occurrences of 'a' from a string.
package recursion;

import java.util.Scanner;

public class StringTraversal {
    public static void print(int i, String s){
        if(i == s.length()) return;
        if(s.charAt(i) != 'a'){
            System.out.print(s.charAt(i));
        }
        print(i+1, s);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter string : ");
            String s = sc.nextLine();
            print(0, s);
        }
    }
}
