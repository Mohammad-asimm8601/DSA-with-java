// Return the total number of digits in a number without using any loop.
package string.question;

import java.util.Scanner;

public class NumberOfdigits {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number : ");
            Long n = sc.nextLong();

            // String  s = ""+n;
            String s = Long.toString(n);
            int digit = s.length();
            System.out.println(digit);
        }
    }
}
