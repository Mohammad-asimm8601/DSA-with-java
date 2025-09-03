// Find the second largest element in the given array.
package arrays.questions;

public class SecondLargestNum {
    public static void main(String[] args) {
        int[] arr = {2, 1, -7, 95, 84, 39};
        int len = arr.length;

        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            mx = Math.max(mx, arr[i]);
        }
        // int  smx = Integer.MIN_VALUE;
        int  smx = arr[0];
        for (int i = 1; i < len; i++) {
            if(arr[i] != mx)
                smx = Math.max(smx, arr[i]);
        }
        System.out.println(mx);
        System.out.println(smx);
    }
}
    