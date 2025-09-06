// Find the doublet in the array whose sum is equal to the given value x. (Two sum)
package arrays.questions;

import java.util.Scanner;

public class ArrayDoubletSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 2, 5, 43, 1, 4, 9 };
        int x = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
        sc.close();

    }
}
