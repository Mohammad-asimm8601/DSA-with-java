package multidimensionalArrays;

public class PrintPrimaryAndSecondaryElement {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4, 5},
            {4, 5, 6, 7, 9},
            {4, 5, 6, 7, 0},
            {7, 8, 9, 9, 1},
            {7, 8, 9, 8, 7},};

        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i+j == m - 1) {
                    System.out.printf("%3d", arr[i][j]);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
