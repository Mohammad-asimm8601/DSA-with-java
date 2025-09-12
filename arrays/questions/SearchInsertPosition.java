package arrays.questions;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 9};
        int target = 3;
        int res =search(arr, target);
        System.out.print(res);
    }
    public static int search(int[] arr, int target){
        int n = arr.length;
        int low=0, high= n-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
               return mid;
            }
            else if(arr[mid] > target){
                high = mid - 1;
            }
            else{
                low = low + 1;
            }
        }
        return low;
    }
}