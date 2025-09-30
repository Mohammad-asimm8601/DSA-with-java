// Given two string  s and t, determine if they are isomorphic.
package string.question;

import java.util.*;
public class Isomorphic
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();
            String t = sc.next();
            boolean b = isomorphic(s,t);
            System.out.println(b);
        }
	}
    public static boolean isomorphic(String s, String t){
        if(s.length() != t.length()) return false;
        char[] arr = new char[128];
        int n = s.length();
        for(int i=0; i<n; i++){
            int ch =(int) s.charAt(i);
            char dh = t.charAt(i);
            if(arr[ch] =='\0') arr[ch] = dh;
            else{
                if(arr[ch] != dh) return false;
            } 
        }
        for(int i=0; i<128; i++){
            arr[i] = '\0';
        }
        for(int i=0; i<n; i++){
            int  ch =(int) t.charAt(i);
            char dh = s.charAt(i);
            if(arr[ch] =='\0') arr[ch] = dh;
            else{
                if(arr[ch] != dh) return false;
            } 
        }
        return true;

    }
}


