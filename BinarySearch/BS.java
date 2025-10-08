package BinarySearch;

public class BS {
    public static void main(String[] args) {
        int[] arr = { 10, 15, 21, 34, 81, 105, 180, 500, 614 };
        int n = arr.length;
        int target = 81;
        boolean flag = false;
        int low = 0, hi = n - 1;
        while (low <= hi) {
            int mid = (low + hi) / 2;
            if (arr[mid] < target)
                low = mid + 1;
            else if (arr[mid] > target)
                hi = mid - 1;
            else if (arr[mid] == target) {
                System.out.println("Element " + target + " found at index : " + mid);
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("Element not found!");
        }

    }
}
