package arrays;
import java.util.Arrays;
public class CopyOfArray {
    public static void main(String[] args) {
        int[] arr = {30, 67, 58, 304, 12, 32};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        // int[] nums = arr;  // shallow copy
        // nums[0] = 40;
        // System.out.println(arr[0]);
        // for (int ele : nums){
        //     System.out.print(ele+" ");
        // }

        // deep copy;
        int[] brr = Arrays.copyOf(arr, arr.length);
        brr[0] = 70;
        System.out.println(arr[0]);

        int[] crr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            crr[i] = 100;
        }
        System.out.println(arr[0]);
    }
}
