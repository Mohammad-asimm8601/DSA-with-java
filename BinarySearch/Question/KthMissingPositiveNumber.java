// Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
package BinarySearch.Question;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4 };
        int k = 2;
        int n = arr.length;
        int lo = 0, hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int missed = arr[mid] - (mid + 1);
            if (missed < k)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        System.out.println(k+lo);

    }
}
