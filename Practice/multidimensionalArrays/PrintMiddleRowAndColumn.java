package multidimensionalArrays;

public class PrintMiddleRowAndColumn {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4, 5},
            {3, 4, 5, 6, 7},
            {7, 6, 5, 4, 3,},
            {8, 7, 6, 5, 4},
            {1, 2, 37, 8, 0}
        };
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i==m/2 || j==n/2){
                    System.out.print(arr[i][j]+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
