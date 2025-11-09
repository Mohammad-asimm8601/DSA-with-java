// Print sum from 1 to n (parameterised)
package recursion;

import java.util.Scanner;

public class PrintSumOfIncreasing {
    public static void print(int n, int sum){
        if (n == 0){  // base case
            System.out.println(sum);
           return; 
        } 
        print(n-1, sum+n);  //call and work
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n : ");
            int n = sc.nextInt();
            print(n, 0);
        }
    }
}
