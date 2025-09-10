package arrays.questions;

public class NextGreatestElement {
    public static void main(String[] args) {
        int[] arr = {12, 8, 60, 37, 2, 49, 16, 28, 21};
        int n = arr.length;
        int[] ans = new int[n];

        // // Method--1 Brute Force
        // for (int i = 0; i < n-1; i++) {
        //     ans[i] = Integer.MIN_VALUE;
        //     for (int j = i+1; j < n; j++) {
        //         ans[i] = Math.max(ans[i], arr[j]);
        //     }
        // }
        ans[n-1] = -1;

        int nge = arr[n-1];
        for (int i = n-2; i >=0; i--) {
            ans[i] = nge;
            nge = Math.max(nge, arr[i]);
        }

        // Method-2 Optimized
        for(int ele : ans){
            System.out.print(ele+" ");
        }

    }
}
