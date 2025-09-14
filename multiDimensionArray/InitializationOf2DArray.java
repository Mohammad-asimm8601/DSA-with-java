package multidimensionarray;

public class InitializationOf2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1234, 56},{1256, 43}, {1434, 32}, {1312,96}};
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
