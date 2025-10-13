// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
package CyclicSort;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumber {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 1 };
        List<Integer> list = findDisappearingNumber(arr);
        System.out.println(list);
    }
    public static  List<Integer> findDisappearingNumber(int[] arr){
        int n = arr.length;
        List<Integer> list = new ArrayList<>();
        int i =0;
        while(i<n){
            int idx = arr[i] - 1;
            if(arr[i] != arr[idx])  swap(arr, i, idx);
            else i++;
        }
        for (int  ele : arr) {
            System.out.print(ele + " ");
        }
        for ( i = 0; i < n; i++) {
            if(arr[i] != i+1){
                list.add(i+1);
            }
        }
        return list;
    }
 }
