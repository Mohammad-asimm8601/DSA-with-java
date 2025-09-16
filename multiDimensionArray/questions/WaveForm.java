package multidimensionarray.questions;

public class WaveForm {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int a=1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = a;
                a++;
            }
        }
        for (int[] ele : arr) {
            for(int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
