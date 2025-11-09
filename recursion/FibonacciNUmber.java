// Write a program to calculate the nth fibonacci number using recursion.
package recursion;

import java.util.Scanner;

public class FibonacciNUmber {
    public static int  fibo(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n : ");
            int n  = sc.nextInt();
            System.out.println(fibo(n));
        }
    }
}
