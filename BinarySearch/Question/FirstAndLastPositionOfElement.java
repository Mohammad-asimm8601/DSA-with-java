// Given an array of integers nums sorted in non-decreasing order, write a program to find the starting and ending positions of a given target value. If the target is not found in the array, return [-1, -1]. The algorithm must run in O(log n) time complexity.
package BinarySearch.Question;

public class FirstAndLastPositionOfElement {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 10, 10, 20, 20, 20, 20, 20, 30, 30, 30, 40, 40 };
        int target = 20;
        int n = arr.length;
        boolean flag = false;
        int[] ans = { -1, -1 };
        int lo = 0, hi = n - 1;

        // Method - 1

        // check element present or not
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target) {
                flag = true;
                break;
            } else if (arr[mid] > target)
                hi = mid - 1;
            else if (arr[mid] < target)
                lo = mid + 1;
        }
        if (flag == false)
            print(ans);
        else {
            // now find lower bound
            lo = 0;
            hi = n - 1;
            int lb = n;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (arr[mid] >= target) {
                    lb = Math.min(lb, mid);
                    hi = mid - 1;
                } else
                    lo = mid + 1;
            }
            ans[0] = lb;

            // then find upper bound
            lo = 0;
            hi = n - 1;
            int ub = n;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (arr[mid] > target) {
                    ub = Math.min(ub, mid);
                    hi = mid - 1;
                } else
                    lo = mid + 1;
            }
            ans[1] = ub - 1;
            print(ans);
        }


//         // Method - 2

//         // first position
//         int fp = -1; lo = 0; hi = n-1;
//         while(lo <= hi){
//             int mid = lo + (hi- lo)/2;
//             if(arr[mid] == target){
//                 if(mid > 0 && arr[mid] == arr[mid-1]) hi = mid - 1;
//                 else{
//                     fp = mid;
//                     break;
//                 }
//             }
//             else if(arr[mid] > target) hi = mid -1;
//             else if(arr[mid] < target) lo = mid + 1;
//         }

//         // last position
//         int lp = -1; lo = 0; hi = n-1;
//         while(lo <= hi){
//             int mid = lo + (hi- lo)/2;
//             if(arr[mid] == target){
//                 if(mid+1 < n && arr[mid] == arr[mid+1]) lo = mid + 1;
//                 else{
//                     lp = mid;
//                     break;
//                 }
//             }
//             else if(arr[mid] > target) hi = mid -1;
//             else if(arr[mid] < target) lo = mid + 1;
//         }
//         ans[0] = fp; ans[1] = lp;
//         print(ans);

    }
}
