// Write a program to rotate the matrix by 90 degrees clockwise.
package multidimensionarray.questions;

public class RotateTheMatrix90Degree {

    public static void print(int[][] arr){
        for(int[] ele : arr){
            for(int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        System.out.println("Original matrix...");
        print(arr);
        int m = arr.length;

        // Transposing
        System.out.println("Transpose of matrix...");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr);

        // Rotating
        System.out.println("Rotate the matrix...");
        for (int i = 0; i < m; i++) {
            int a = 0, b = m-1;
            while(a<b){
                int temp = arr[i][a];
                arr[i][a] = arr[i][b];
                arr[i][b] = temp;
                a++;
                b--;
            }
        }
        print(arr);
    }
}
