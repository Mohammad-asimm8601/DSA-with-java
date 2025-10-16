package BinarySearch.Question;

public class CapacityToShipPackages {
    public static boolean  isPossible(int mid, int[] arr, int d){
        int load = 0;
        int days = 1;
        for (int i = 0; i < arr.length; i++) {
            if(load+arr[i] <= mid) load +=arr[i];
            else{
                load = arr[i];
                days++;
            }
        }
        return days <= d;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int d = 5;
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, arr[i]);
            sum += arr[i];
        }
        int lo = mx, hi = sum, minC = sum;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(isPossible(mid, arr, d)){
                minC = mid;
                hi = mid - 1;
            }
            else {
                lo = mid + 1;
            }

        }
       System.out.println(minC);
    
    }
}
