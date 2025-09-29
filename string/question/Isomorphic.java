// Given two string  s and t, determine if they are isomorphic.
package string.question;

import java.util.Scanner;

public class Isomorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int n = s.length();
        char[] arr = new char[128];
        for (int i = 0; i < n; i++) {
            int ch = (int)s.charAt(i);
            char dh = t.charAt(i);
            if(arr[ch] == '\0') arr[ch] = dh;
            else{
                if(arr[ch] != dh) System.out.println(false);
                else System.out.println(true);
            }
        }
        for (int i = 0; i < 128; i++) {
            arr[i] = '\0';
        }
        for (int i = 0; i < n; i++) {
            int ch = (int)t.charAt(i);
            char dh = s.charAt(i);
            if(arr[ch] == '\0') arr[ch] = dh;
            else{
                if(arr[ch] != dh) System.out.println(false);
                else System.out.println(true);
            }
        }
       
        for (int i = 0; i < 128; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
