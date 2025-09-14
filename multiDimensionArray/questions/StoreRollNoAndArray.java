package multidimensionarray.questions;

public class StoreRollNoAndArray {
    public static void main(String[] args) {
        int[][] arr = {{2265, 45},{2264, 78},{2258, 65}, {1234, 65}};
        for(int[] ele : arr){
            for(int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }

    }
}
