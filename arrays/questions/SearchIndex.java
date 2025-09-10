// Search in Rotated in sort Array
package arrays.questions;

public class SearchIndex{
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 5, 1, 2};
        int target = 3;
        int res = search(nums, target);
        if(res == -1){
            System.out.println(-1);
        }else{
            System.out.println(res);
        }
        

    }
    public static  int search(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}
