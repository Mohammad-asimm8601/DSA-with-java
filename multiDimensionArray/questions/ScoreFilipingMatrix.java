// Score after filiping matrix. 
package multidimensionarray.questions;

public class ScoreFilipingMatrix {
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
        int[][] arr = { { 0, 0, 1, 1 }, { 1, 0, 1, 0 }, { 1, 1, 0, 0 } };
        System.out.println("Original matrix...");
        print(arr);
        int m = arr.length, n  = arr[0].length;

        // filipped rows
        for (int i = 0; i < m; i++) {
            if(arr[i][0] == 0){
                for (int j = 0; j < n; j++) {
                    arr[i][j] = 1 - arr[i][j];
                }
            }
        }
        // filipped cols
        for (int j = 1 ; j < n; j++) {
            int noOfZeros = 0, noOfOnes = 0;
            for (int i = 0; i < m; i++) {
                if(arr[i][j] == 0) noOfZeros++;
                else noOfOnes++;
            }
            if(noOfZeros > noOfOnes){
                for (int i = 0; i < m; i++) {
                    arr[i][j] = 1 - arr[i][j];
                }
            }
        } 
        System.out.println("Flipped matrix...");
        print(arr);

        // Calculating the score
        int score = 0;  
        int x = 1;
        for (int j = n-1; j >= 0; j--) {
            for (int i = 0; i < m; i++) {
                score += (arr[i][j]*x);
            }
            x *= 2;
        }
        System.out.println(score);
    }
}
