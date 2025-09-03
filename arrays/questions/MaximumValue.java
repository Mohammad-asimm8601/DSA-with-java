// Find the maximum value out of all the elements in the array.
package arrays.questions;

public class MaximumValue {
    public static void main(String[] args) {
        int[] arr = {23, 45, -65, 78, -2, 43, 32};
        int len = arr.length;

        int max = Integer.MIN_VALUE;
        for (int i = 1; i < len; i++) {
            // if(arr[i] > max) max = arr[i]; 
            max = Math.max(max, arr[i]);
            
        }
        System.out.println(max);
    }
}
