// Print 1 to n (extra parameter)
package recursion;

import java.util.Scanner;

public class PrintIncrease {
    public static void print(int x, int n){
        if( x > n) return;  // base case
        System.out.println(x);  // work
        print(x+1, n);  // call
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n : ");
            int n = sc.nextInt();
            print(1,  n);
        }

    }
}
