package arrayP;

public class RotateArray {

    private static void reverse(int i, int j, int[] arr) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70,};
        int n = arr.length;
        int k = 17;
        k = k % n;
        reverse(0, n - k - 1, arr);
        reverse(n - k, n - 1, arr);
        reverse(0, n - 1, arr);

        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }
}
