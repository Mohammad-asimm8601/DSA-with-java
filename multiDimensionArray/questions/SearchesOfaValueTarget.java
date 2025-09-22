/*  Write an efficient algorithm that searches for a value target in a an m x n integer matrix which has the following properties:

    -> Integers in each row are sorted in ascending from left to right.
    -> Integers in each column are sorted in ascending from top to       bottom. 

*/
package multidimensionarray.questions;

import java.util.Scanner;

public class SearchesOfaValueTarget {
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
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{1, 4, 7, 11, 15},{2, 5, 8, 12, 19},{3, 6, 9, 16, 22},{10, 13, 14, 17, 24},{18, 21, 23, 26, 30}};
        print(arr);
        int target = 14;
        boolean res = search(arr ,target);
        System.out.println(res);
    }

    public static boolean   search(int[][] arr, int target){
        int m = arr.length;
        int n = arr[0].length;

        int i =0, j=n-1;
        while(i<m && j >=0){
            if(arr[i][j] == target) return true;
            else if(arr[i][j] > target){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
        
    }
}
