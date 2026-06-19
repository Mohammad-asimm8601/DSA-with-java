package multidimensionalArrays;

import java.util.Scanner;

public class spiralwave {

    private static void print(int[][] arr){
        for(int[] row : arr){
            for(int ele : row){
                System.out.print(ele+" ");
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
                
            }
           
            print(arr);
        }
    }
}
