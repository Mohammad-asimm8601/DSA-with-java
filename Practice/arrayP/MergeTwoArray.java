// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m
// and n, representing the number of elements in nums1 and nums2 respectively.
// Merge nums1 and nums2 into a single array sorted in non-decreasing order.

package arrayP;

public class MergeTwoArray {
    public static void main(String[] args) {

        int[] nums1 = {1,3,5,7,9,11};
        int[] nums2 = {2,4,6,8,10};

        int[] mergeArray = new int[nums1.length + nums2.length];

        int i = 0, j = 0, k = 0;

        while(i < nums1.length && j < nums2.length){
            mergeArray[k++] =
                (nums1[i] < nums2[j]) ? nums1[i++] : nums2[j++];
        }

        while(i < nums1.length)
            mergeArray[k++] = nums1[i++];

        while(j < nums2.length)
            mergeArray[k++] = nums2[j++];

        for(int x : mergeArray)
            System.out.print(x + " ");
    }
}