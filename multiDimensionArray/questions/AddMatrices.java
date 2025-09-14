package multidimensionarray.questions;

import java.util.Scanner;

public class AddMatrices {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter rows:");
            int rows = sc.nextInt();
            System.out.print("Enter cols:");
            int cols = sc.nextInt();

            System.out.println("Enter first matrix: ");
            int[][] mtx1 = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    mtx1[i][j] = sc.nextInt();
                }
            }
            System.out.println();

            System.out.println("Enter second matrix: ");
            int[][] mtx2 = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    mtx2[i][j] = sc.nextInt();
                }
            }
            System.out.println();

            System.out.println("Add of two matrices:");
            int[][] addmtx = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    addmtx[i][j] = mtx1[i][j] + mtx2[i][j];
                    System.out.print(addmtx[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
