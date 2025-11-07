// Print number from n to 1 by recursion.
package recursion;

import java.util.Scanner;

public class PrintNtoOne {
    public static void print(int n) {
        if (n == 0) return;
        System.out.println(n);
        print(n - 1);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n : ");
            int n = sc.nextInt();
            print(n);
        }
    }
}
