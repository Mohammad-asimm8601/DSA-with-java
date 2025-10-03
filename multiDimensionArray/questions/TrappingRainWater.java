package multidimensionarray.questions;

import java.util.Scanner;

public class TrappingRainWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int total = 0;
        for (int i = 1; i < m - 1; i++) {
            int mid = 1;
            while (mid < n - 1) {
                int left = mid - 1;
                int right = mid + 1;
                int leftmx = Integer.MIN_VALUE;
                int rightmx = Integer.MIN_VALUE;
                while (left >= 0) {
                    leftmx = Math.max(leftmx, arr[i][left]);
                    left--;
                }
                while (right < n) {
                    rightmx = Math.max(rightmx, arr[i][right]);
                    right++;
                }
                int water = Math.max(leftmx, rightmx) - arr[i][mid];
                total +=water;
                mid++;
            }
        }
        System.out.println(total);

    }
}
