package multidimensionalArrays;

public class RotateMatrixAntiClock90deg {

    private static void swap(int i, int j, int[][] arr) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                swap(i, j, arr);
            }
        }
        for (int j = 0; j < n; j++) {
            int a = 0, b = n - 1;
            while (a < b) {
                int temp = arr[a][j];
                arr[a][j] = arr[b][j];
                arr[b][j] = temp;
                a++;
                b--;
            }
        }
        for (int[] row : arr) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
