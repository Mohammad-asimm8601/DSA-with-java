package multidimensionarray;

public class ForEachLoop {
    public static void main(String[] args) {
        int[][] arr = {{12, 43}, {45, 67}, {90, 10}};
        for(int[] ele : arr){
            for(int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }

    }
}
