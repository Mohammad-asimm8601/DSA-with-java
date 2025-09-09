package arrays.questions;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr = { 11, 33, 42, 71, 84 };
        int m = arr.length;
        int[] brr = { 26, 54, 69, 81, 94 };
        int n = brr.length;

        int[] crr = new int[m + n];
        // Method-1
        // merge two array
//         for (int i = 0; i < m; i++) {
//         crr[i] = arr[i];
//         crr[i+m] = brr[i];
//         }
//         //sort array (crr)
//         for (int i = 0; i <= m+n; i++) {
//         for (int j = i+1; j < m+n-1; j++) {
//             if(crr[i] > crr[j]){
//                 int temp = crr[i];
//                 crr[i] = crr[j];
//                 crr[j] = temp;
//             }
//         }
// }

        // method-2
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (arr[i] <= brr[j]) {
                crr[k++] = arr[i++];
            } else {
                crr[k++] = brr[j++];
            }
        }
        while (i < m) {
            crr[k++] = arr[i++];
        }
        while (j < n) {
            crr[k++] = brr[j++];
        }

        for (int ele : crr) {
            System.out.print(ele + " ");
        }
    }
}
