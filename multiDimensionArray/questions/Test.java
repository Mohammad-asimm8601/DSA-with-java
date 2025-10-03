package multidimensionarray.questions;

public class Test {
    public static void main(String[] args) {
        int[] arr = {10, 8 ,3 ,4, 5, 6, 7};
        int n = arr.length;
        int mid = 3;
        int left =mid - 1;
        int right = mid + 1;
        int leftmx =Integer.MIN_VALUE;
        int rightmx = Integer.MIN_VALUE;
        while (left >= 0) {
            leftmx = Math.max(leftmx, arr[left]);
            left--;
        }
        while (right < n) {
            rightmx = Math.max(rightmx, arr[right]);
            right++;
        }
        System.out.println(leftmx);
        System.out.println(rightmx);
    }
}
