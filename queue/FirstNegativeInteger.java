package queue;

import java.util.*;

public class FirstNegativeInteger {
    public static int[] window(int[] arr, int k){
        int[] res = new int[arr.length-k+1];
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) q.add(i);
        }int i =0;
        while(i < arr.length-k+1) {
            if(!q.isEmpty() && q.peek()<i) q.remove();
            else if(!q.isEmpty() && q.peek()<=i+k-1){
                res[i] = arr[q.peek()];
                i++;
            }
            else if(q.isEmpty()){
                 res[i] =0;
                 i++;
            }
            else{
                res[i] = 0;
                i++;
            }
        }
        return res;

    }
    public static void main(String[] args) {
        int[] arr = { 12, -1, -7, 8, -15, 30, 16, 28 };
        int k = 3;
        int[] res = window(arr, k);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
