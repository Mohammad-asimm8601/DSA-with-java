// Reverse each word in a given sentence. (Ex : i am mohammad asim -> i ma dammahom misa)
package string.question;

import java.util.Scanner;

public class ReverseSentenceWord {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            StringBuilder sb = new StringBuilder(sc.nextLine());
            int n = sb.length();
            int i = 0;
            for (int j = 0; j <= n; j++) {

                if (j == n || sb.charAt(j) == ' ') {
                    int left = i, right = j - 1;
                    while (left < right) {
                        char temp = sb.charAt(left);
                        sb.setCharAt(left, sb.charAt(right));
                        sb.setCharAt(right, temp);
                        left++;
                        right--;
                    }
                    i = j + 1;
                }
            }
            System.out.println(sb);
        }
    }
}
