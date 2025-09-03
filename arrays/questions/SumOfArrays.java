package arrays.questions;

public class SumOfArrays {
    public static void main(String[] args) {
        int[] arr = {23, 3, 43, 45, 36};
        int n = arr.length;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
