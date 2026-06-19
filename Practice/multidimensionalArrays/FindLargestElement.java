// Write the program to find the largest element of a given 2D array of integers.
package multidimensionalArrays;

public class FindLargestElement {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 3, 4, 6},
            {2, 4, 5, 7},
            {3, 5, 6, 8},
            {4, 6, 7, 9}
        };
        int max = arr[0][0];
        for (int[] row : arr) {
            for (int ele : row) {
                if (ele > max) {
                    max = ele;
                }
            }
        }
        System.out.println(max);
    }
}
