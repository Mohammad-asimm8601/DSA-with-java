// Given a sorted integer array and an integer 'x', find the lower bound of x.
package BinarySearch.Question;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 30, 40, 50, 60, 70 };
        int target = 70;
        int res = LB(arr, target);
        System.out.println(res);

    }

    public static int LB(int[] arr, int target) {
        int n = arr.length;
        int lo = 0, hi = n - 1;
        int lb = n;
        while (lo <= hi) {
            int mid =  lo +(hi - lo) / 2;
            if (arr[mid] >= target) {
                lb = Math.min(lb, mid);
                hi = mid - 1;
            } else
                lo = mid + 1;
        }
        return lb;
    }
}
