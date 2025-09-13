// Find the minimum value out of all element in the array.
package arrays.assignment;

public class MinimumValue {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1};
        int n = arr.length;
        int min = Integer.MAX_VALUE; 
        for (int i = 0; i < n; i++) {
            if(arr[i]  < min ){
                min = arr[i];
            }
        }
        System.out.println(min);
        
    }
}
