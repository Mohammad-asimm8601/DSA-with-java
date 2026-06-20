package multidimensionalArrays;

import java.util.Scanner;

public class spiralwave {

    private static void print(int[][] arr){
        for(int[] row : arr){
            for(int ele : row){
                System.out.printf("%2d",ele);
            }
            System.out.println();
        }
    }
     
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n  = sc.nextInt();
            int[][] arr = new int[n][n];

            int top = 0, bottom = n-1;
            int left = 0, right = n-1;

            int num = 1;

            while(top <= bottom && left <= right){

                // left to right
                for (int j = left; j <= right; j++) {
                    arr[top][j] = num++;
                }
                top++;

                // top to bottom
                for (int i = top; i <= bottom; i++) {
                    arr[i][right] = num++;
                }
                right--;

                // right to left
                for (int j = right; j >= left; j--) {
                    arr[bottom][j] = num++;
                }
                bottom--;

                // bottom to top
                for (int i = bottom; i >= top; i--) {
                    arr[i][left] = num++;
                }
                left++;
               
            }
           
            print(arr);
        }
    }
}
