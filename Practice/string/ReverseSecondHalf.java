// Input a string of even length and reverse the second half of the string.
package string;

import java.util.Scanner;

public class ReverseSecondHalf {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            int n = str.length();
            String firstHalf = str.substring(0, (n+1)/2);
            StringBuilder  secondHalf = new StringBuilder();
            for (int i = n-1; i >= (n+1)/2; i--) {
                secondHalf.append(str.charAt(i));
            }
            System.out.println(firstHalf+secondHalf);
        }
    }
}
