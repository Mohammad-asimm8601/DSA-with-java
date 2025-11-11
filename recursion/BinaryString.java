// Generate all binary strings of length n without consecutive 1's.
package recursion;

import java.util.Scanner;

public class BinaryString {
    public static void bs(int n, String s){
        int m = s.length();
        if(m == n){
            System.out.println(s);
            return;
        }
        if(m==0 || s.charAt(m-1) == '0') {
            bs(n, s+0);
            bs(n, s+1);
        } 
        else bs(n, s+0) ;

    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n : ");
            int n = sc.nextInt();
            bs(n ,"");
        }
    }
}
