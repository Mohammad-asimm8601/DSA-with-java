package BinarySearch.Question;

public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 80, 50, 60, 70, 20, 10 };
        int n = arr.length;
        int lo = 1, hi = n - 2;
        int index = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                index = mid;
                break;
            } else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1])
                lo = mid + 1;
            else if (arr[mid] < arr[mid - 1] && arr[mid] > arr[mid + 1])
                hi = mid - 1;
        }
        System.out.println(index);

    }
}
