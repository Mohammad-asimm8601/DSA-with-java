// Write a program to print the transpose of the matrix entered by the user and store it in a new matrix
package multidimensionarray.questions;

import java.util.Scanner;

public class MatricesTranspose {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter rows: ");
            int m = sc.nextInt();
            System.out.print("Enter cols: ");
            int n = sc.nextInt();
            
            System.out.println("Enter matrix element :: ");
            int[][] arr = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            
            System.out.println("Transpose of matrix ::");
            int[][] brr = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    brr[i][j] = arr[j][i];
                    System.out.print(brr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
