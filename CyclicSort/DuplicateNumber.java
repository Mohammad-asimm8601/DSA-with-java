// Find the duplicate number
package CyclicSort;

public class DuplicateNumber {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
       int[] arr = {2, 1, 2, 3, 4};
       int n  = arr.length;
       int i = 0;
       while(i < n){
           swap(arr, 0, arr[0]);
           i++;
       }
       System.out.println(arr[0]);
    }
}

