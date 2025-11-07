// Make a function which calculates the factorial of n using recursion.
package recursion;

import java.util.Scanner;

public class Factorial {
    public static int fact(int n) {
        if (n == 1)  // base case
            return 1;
        return n * fact(n - 1);  // call
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n : ");
            int n = sc.nextInt();
            System.out.println(fact(n));
        }
    }
}
