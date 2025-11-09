// Print 1 to n using return type.
package recursion;

import java.util.Scanner;

public class PrintSumOfIncreasingUsingRetrunType {
    public static int sum(int n){
        if(n == 0 || n==1) return n;  // base case
        return n+sum(n-1);  //work
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n : ");
            int n = sc.nextInt();
            System.out.println(sum(n));
        }
    }
}
