// Find the number of ways to reach nth stair if 1 or 2 jump at a time is allowed.
package recursion;

import java.util.Scanner;

public class StairPath {
    public static int ways(int n){
        if(n <= 2) return n ;
        return ways(n-1) + ways(n-2);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n : ");
            int n = sc.nextInt();
            System.out.println(ways(n));
        }

    }
}
