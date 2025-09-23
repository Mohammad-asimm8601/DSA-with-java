// Given an m x n integer matrix matrix, if an element is 0, set its entire row and cols  to 0,s.
package multidimensionarray.questions;

public class SetMatricesZero {
    public static void print(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 2, 11, 21 }, { 3, 0, 24, 21, 9 }, { 6, 10, 7, 0, -8 }, { 0 , 4, 19, 3, 99 } };
        print(arr);
        int m = arr.length;
        int n = arr[0].length;

        // Method -1

        // int[][] helper = new int[m][n];
        // for (int i = 0; i < m; i++) {
        // System.arraycopy(arr[i], 0, helper[i], 0, n);
        // }

        // for (int i = 0; i < m; i++) {
        // for (int j = 0; j < n; j++) {
        // if (helper[i][j] == 0) {
        // // Set the ith row and jth col 0 in arr
        // for (int b = 0; b < n; b++) {
        // arr[i][b] = 0;
        // }
        // for (int a = 0; a < m; a++) {
        // arr[a][j] = 0;
        // }
        // }
        // }
        // }

        // Method -2

        // boolean[] row = new boolean[m];
        // boolean[] cols = new boolean[n];

        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (arr[i][j] == 0) {
        //             row[i] = true;
        //             cols[j] = true;
        //         }
        //     }
        // }

        // for (int i = 0; i < m; i++) {
        //     if (row[i] == true) {
        //         for (int j = 0; j < n; j++) {
        //             arr[i][j] = 0;
        //         }
        //     }
        // }
        // for (int j = 0; j < n; j++) {
        //     if (cols[j] == true) {
        //         for (int i = 0; i < m; i++) {
        //             arr[i][j] = 0;
        //         }
        //     }
        // }

        // print(arr);

        // Method -3
        boolean zeroRow = false;
        boolean zeroCol = false;

        for (int j = 0; j < n; j++) {
            if(arr[0][j] == 0){
                zeroRow = true;
                break;
            }
        }

        for (int i = 0; i < m; i++) {
            if(arr[i][0] == 0){
                zeroCol = true;
                break;
            }
        }

        // ....................................................... //

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(arr[i][j] == 0){
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            } 
        }

        for (int i = 1; i < m; i++) {
            if(arr[i][0] == 0 ){
                for (int j = 1; j < n; j++) {
                    arr[i][j] =0;
                }
            }
        }

        for (int j = 1; j < n; j++) {
            if(arr[0][j] == 0){
                for (int i = 1; i < m; i++) {
                    arr[i][j] = 0;
                }
            }
        }
        // .......................................................//
        // .......................................................//

        if(zeroRow == true){
            for (int j = 0; j < n; j++) {
                arr[0][j] = 0;
            }
        }

        if(zeroCol == true){
            for (int i = 0; i < m; i++) {
                arr[i][0] = 0;
            }
        }

        print(arr);


    }
}
