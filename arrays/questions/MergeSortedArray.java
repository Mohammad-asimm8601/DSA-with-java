// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 repectively.
package arrays.questions;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 0,0,0,0,0};
        int m1 = nums1.length;
        int m = 0;
        for (int i = 0; i < m1; i++) {
            if (nums1[i] > 0)
                m++;
        }
        System.out.println(m);
        int[] nums2 = {1, 2, 3, 4, 5};
        int n1 = nums2.length;
        int n = 0;
        for (int i = 0; i < n1; i++) {
            if (nums2[i] > 0)
                n++;
        }
        System.out.println(n);

        merge(nums1, m, nums2, n);
        for (int ele : nums1) {
            System.out.print(ele + " ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        while (i <= m+n && j < n) {
            if(nums1[i] == 0){
                nums1[i] = nums2[j];
                i++;
                j++;
            }
            else {
                nums1[m+i] = nums2[j];
                i++;
                j++;
                
            }
        }
        for (i = 0; i < m + n; i++) {
            for (j = i + 1; j <= m + n - 1; j++) {
                if (nums1[i] > nums1[j]) {
                    int temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }
    }
}
