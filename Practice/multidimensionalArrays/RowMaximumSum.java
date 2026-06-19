// Write a program to print the row number having the maximum sum in a given matrix.
package multidimensionalArrays;

public class RowMaximumSum {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 3, 5, 7},
            {3, 4, 7, 8},
            {1, 44, 12, 3}
        };
        int rowSum = Integer.MIN_VALUE;
        int row = -1;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
            if(sum > rowSum ){
                rowSum = sum;
                row = i;
            }
        }
        System.out.println("Maximum Row Sum : "+ rowSum);
        System.out.println("Row Number: "+ row);
    }
}
