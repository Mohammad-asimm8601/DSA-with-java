// Given two string s and t, return true if t is an anagram of s and false otherwise.
package string.question;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "abd";
        String t = "bak";
        System.out.println(anagram(s, t));
    }

    public static boolean anagram(String s, String t){
        if(s.length() != t.length()) return false;
        char[] a = s.toCharArray(); 
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) return false;
        }
        return true;
        
    }
    
}