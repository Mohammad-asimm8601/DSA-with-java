// Minimized maximun of products distributed to any store.
package BinarySearch.Question;

public class ProductsDistributed {
    public static boolean isPossible(int maxQ, int n, int[] arr){
        int stores = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%maxQ == 0) stores += arr[i]/maxQ;
            else stores += arr[i]/maxQ + 1;
        }
        return stores <= n; 
    }
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {11, 6};
        int res = minimizedMaximum(n, arr);
        System.out.println(res);
    }
    public static  int minimizedMaximum(int n, int[] arr){
        int m = arr.length;
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            mx = Math.max(mx, arr[i]);
        }
        int lo = 1, hi = mx;
        int ans = 0;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(isPossible(mid, n, arr)){
                ans = mid;
                hi = mid - 1;
            }
            else lo = mid + 1;
        }
        return ans;
       
    }
}
