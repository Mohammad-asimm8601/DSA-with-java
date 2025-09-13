// Find the second largest element in the given array in one pass.
package arrays.assignment;

public class SecondLargestElement {

   
    public static void main(String[] args) {
        int[] arr = {-7, 45, -1, -2, -6};
        int n = arr.length;
        int max = Integer.MIN_VALUE, smx =Integer.MIN_VALUE;
        for (int i = 0;i < n; i++) {
            if(arr[i] > max){
                smx = max;
                max = arr[i];
            }
            else if(arr[i] > smx && arr[i] != max){
                smx = arr[i];
            }
        }

        System.out.println(smx);
       
        
    }
}
