// Take integer input and convert it into a string.
package string.question;

import java.util.Scanner;

public class ConvertIntegerToString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            String s = "" + n;
            System.out.println(s);
        }
    }
}
