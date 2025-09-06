package arrays;

import java.util.Arrays;

public class BuiltInMethods {
    public static void main(String[] args) {
        int[] arr = {23, 43, 44, 78, 12, 43, 98};
        for (int ele : arr) {
            System.out.print(ele+ " ");
        }
        Arrays.sort(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
