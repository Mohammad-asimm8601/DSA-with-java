package arrays.questions;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1};
        int n = arr.length;
        int ans =0;
        for (int i = 0; i < n; i++) {
            ans = ans ^ arr[i];
        }
        System.out.print(ans);
    }
}
