// Input a string of size n and Update all the odd positions in the string to character ‘#’. Consider 0-based
// indexing.

package string;

import java.util.Scanner;

public class UpdateOddPosition {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            StringBuilder sb = new StringBuilder(str);
            for (int i = 0; i < sb.length(); i+=2) {
                sb.setCharAt(i, '#');
            }
            System.out.println(sb);
        }
    }
}
