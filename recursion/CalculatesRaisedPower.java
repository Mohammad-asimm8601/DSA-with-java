// Make a function which calculates 'a' raised to the power 'b' using recursion.
package recursion;

import java.util.Scanner;

public class CalculatesRaisedPower {
    // TC = (log b)
    public static int pow(int a, int b) {
        if (a == 0 && b == 0) {
            System.out.println("Not defined!");
            return -1;
        }
        if (b == 0)
            return 1;
        int ans = a * pow(a, (b - 1) / 2);
        if (b % 2 == 0)
            return ans * ans;
        else
            return ans * ans * a;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a : ");
            int a = sc.nextInt();
            System.out.print("Enter b : ");
            int b = sc.nextInt();
            System.out.println(pow(a, b));
        }
    }
}
