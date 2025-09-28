// Take input a StringBuilder & reverse it without using builtin function.
package string.question;

import java.util.Scanner;

public class ReverseWithoutBuiltinFunction {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            StringBuilder sb = new StringBuilder(sc.nextLine());
            int n  = sb.length();
            int i=0, j=n-1;
            while(i<j){
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;
            }
            System.out.println(sb);
        }
    }
}
