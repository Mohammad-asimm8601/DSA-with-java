package Hashmaps;

import java.util.HashMap;

public class TwoSum{
    public static void main(String[] args) {
        int[] nums = {2, 5, 9, 4};
        int target = 9;
        int[] ans = {-1, -1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int rem = target - nums[i];
            if(map.containsKey(rem)){
                int j =  map.get(rem);
                ans[0] = i;
                ans[1] = j;
            }
            else map.put(nums[i], i);
        }
        for (int elem : ans) {
            System.out.print(elem+" ");
        }
    }
}
