package recursion;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static int gcd(int a, int b){
        if( b%a == 0) return a;
        return gcd(b%a, a);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a : ");
            int a = sc.nextInt();
            System.out.print("Enter b : ");
            int b = sc.nextInt();
            System.out.println(gcd(a, b));
        }
    }
}
