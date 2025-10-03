package multidimensionarray.questions;

import java.util.Scanner;

public class TrappingRainWater {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] arr = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int total = max(arr, m, n);
            System.out.println(total);
        }

    }

    public static int max(int[][] arr, int m, int n) {
        int total = 0;
        for (int i = 1; i < m-1; i++) {
            
            int row = minBoundary(arr, m, n);
            int mid = 1;
            while (mid < n - 1) {
                int left = mid - 1;
                int right = mid + 1;
                int leftmx = Integer.MIN_VALUE;
                int rightmx = Integer.MIN_VALUE;
                while (left >= 0) {
                    leftmx = Math.max(leftmx, arr[row][left]);
                    left--;
                }
                while (right < n) {
                    rightmx = Math.max(rightmx, arr[row][right]);
                    right++;
                }
                if (arr[i][mid] < leftmx && arr[i][mid] < rightmx) {
                    int water  = Math.min(leftmx, rightmx)- arr[i][mid];
                    total += water ;
                }
                mid++;
            }
        }
        return total;
    }

    

    public static int minBoundary(int[][] arr, int m, int n) {
        for (int i = 1; i < m-1; i++) {
            int mid = 1;
            while (mid < n - 1) {
                int up = arr[i - 1][mid];
                int down = arr[i + 1][mid];
                int left = arr[i][mid - 1];
                int right = arr[i][mid + 1];
                if (up < down && up < left && up < right) {
                    mid++;
                    return i - 1;
                } else if (down < up && down < left && down < right) {
                    mid++;
                    return i + 1;
                } else {
                    mid++;
                    return i;
                }
            }
        }
        return -1;
    }
    
}
