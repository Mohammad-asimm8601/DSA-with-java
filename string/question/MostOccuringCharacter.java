package string.question;

import java.util.Scanner;

public class MostOccuringCharacter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();
            int n = s.length();
            int[] arr = new int[26];
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                int idx = (int)ch -97;
                arr[idx]++;
            }
            int max = 0;
            for (int i = 0; i < 26; i++) {
                max = Math.max(max, arr[i]);
                if (arr[i] == max) {
                    char ch = (char) (97 + i);
                    System.out.println(ch + " --> " + max);
                }
            }
        }
    }
}
