package string;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine().toLowerCase();

            StringBuilder rev = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                rev.append(str.charAt(i));
            }
            if (rev.toString().equals(str)) {
                System.out.println("Palindrome"); 
            }else {
                System.out.println("Not a Palindrome!");
            }
        }
    }
}
