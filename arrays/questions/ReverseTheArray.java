// Write a program to reverse the array without using any extra array.
package arrays.questions;

public class ReverseTheArray {
    public static void main(String[] args) {
        int[] arr = {12, 34, 54, 65, 75, 67};
        int n = arr.length;

        for (int ele : arr) {
           System.out.print(ele+" ");
        }
        System.out.println();
        
        // reverse
        // for (int i = 0; i < n/2; i++) {
        //     int temp = arr[i];
        //     arr[i] = arr[n-1-i];
        //     arr[n-1-i] = temp;
        // }
        int i=0, j=n-1;
        while(i<=j){
            swap(arr, i, j);
            i++;
            j--;
        }

        for (int ele : arr) {
           System.out.print(ele+" ");
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }
}
