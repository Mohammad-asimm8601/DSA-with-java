package Heaps;

import java.util.PriorityQueue;

public class KSortedArray {
    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 2, 8, 1, 4};
        int k = 6;
        // int[] ans = new int[arr.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if(i >= k){
                int min = pq.remove();
                arr[i-k] = min;
            }
        }
        for (int i = arr.length-k; i < arr.length; i++) {
            arr[i] = pq.remove();
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
