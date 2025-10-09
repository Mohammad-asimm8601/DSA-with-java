package BinarySearch.Question;

public class UpperBound {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 30, 40, 50, 60, 70};
        int target = 30;
        int res = UB(arr, target);
        System.out.println(res);
    }
    public static int UB(int[] arr, int target){
        int n = arr.length;
        int ub = n;
        int lo = 0, hi = n-1;
        while(lo <= hi){
            int mid = lo + (hi -  lo)/2;
            if(arr[mid] > target){
                ub = Math.min(ub, mid);
                hi = mid -1;
            }
            else lo = mid + 1;
        }
        return ub;
    }
}
