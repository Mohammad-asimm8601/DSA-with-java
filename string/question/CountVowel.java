// Input a string and count all the vowels in the given string.
package string.question;

import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a sentence : ");
            String str = sc.nextLine();
            int res = vowels(str);
            System.out.println(res);
        }
        
    }
    public static int vowels(String str) {
        int count =0;
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') count +=1;
            
        }
        return count;
    }
}
