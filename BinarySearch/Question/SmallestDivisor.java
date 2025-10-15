// Find the smallest Divisor given a threshold.
package BinarySearch.Question;

public class SmallestDivisor {
    public static boolean  isLess(int mid, int[] arr, int t) {
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%mid == 0) sum += arr[i]/mid;
            else sum += arr[i]/mid+1;
        }
        return sum <= t;

    }
    public static void main(String[] args) {
        int[] arr = {44,22,33,11,1};
        int threshold = 5;
        int res = smallestDivisor(arr, threshold);
        System.out.println(res);

    }
    public static int smallestDivisor(int[] arr, int t){
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            mx = Math.max(mx, arr[i]);
        }
        int d = 1;
        int lo= 1, hi = mx;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(isLess(mid, arr, t) == true){
                d = mid;
                hi = mid-1;
            }
            else lo = mid +1;
        }
        return d;
    }

}
