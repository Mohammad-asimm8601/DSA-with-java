// Check if given array is sorted arrray.
package BasicSortingAlgorithm;

public class CheckSorting {
    public static void main(String[] args) {
        int[] arr = { 1, 7, 3, 8, 9, 12 };
        int n = arr.length;
        boolean flag = true;
        
        for (int i = 0; i < n-1; i++) {
            if(arr[i] > arr[i+1]){
                flag = false;
                break;
            }
        }
        if(flag == false) System.out.println("Unsorted");
        else System.out.println("Sorted");
    }
}
