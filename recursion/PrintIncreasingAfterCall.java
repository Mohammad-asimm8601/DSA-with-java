// Print the numbers from 1 to n (after recursive call )
package recursion;

import java.util.Scanner;

public class PrintIncreasingAfterCall {
    public static void print(int n){
        if(n == 0) return;  //base case
        print(n-1);  // call
        System.out.println(n); // work
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n : ");
            int n = sc.nextInt();
            print(n);
        }
    }
}
