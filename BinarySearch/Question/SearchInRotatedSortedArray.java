// Search in rotated sorted array
package BinarySearch.Question;

public class SearchInRotatedSortedArray {

    public static int bs(int arr[], int lo, int hi, int target) {
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 7, 8, 0, 1, 2 };
        int target = 1;
        int res = search(arr, target);
        System.out.println(res);

    }

    public static int search(int[] arr, int target) {
        // Method - 1
        int n = arr.length;
        if(n <= 2){
            for (int i = 0; i < n; i++) {
                if(arr[i] == target) return i;
            }
            return -1;
        }
        int p = -1;
        int lo = 0, hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                p = mid;
                break;
            } else if (arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                p = mid - 1;
                break;
            } else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                if (arr[mid] > arr[n - 1])
                    lo = mid + 1;
                else
                    hi = mid - 1;
            }

        }
        if (p == -1) {
            int res = bs(arr, 0, n - 1, target);
            return res;
        }
        int left = bs(arr, 0, p, target);
        if (left != -1)
            return left;

        int right = bs(arr, p + 1, n - 1, target);
        return right;
    }
}
