package multidimensionalArrays;

public class AddTwoMatrices {

    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr2 = {{4, 5, 8}, {0, 0, 8}, {1, 2, 0}};
        int m = arr1.length;
        int n = arr1[0].length;

        int[][] ans = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for (int[] ele : ans) {
            for (int x : ele) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
 