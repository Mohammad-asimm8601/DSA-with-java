package BinarySearch.Question;

public class ClosestElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        boolean flag = false;
        int k = 4;
        int x = 3;
        int lo =0, hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid] == x){
                flag = false;
                break;
            }
        }

    }
}
