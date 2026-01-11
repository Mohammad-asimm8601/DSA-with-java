package queue;

import java.util.*;

public class ReorderQueue {
    public static void reverseQ(Queue<Integer> q){
        if(q.isEmpty()) return;
        int x = q.remove();
        reverseQ(q);
        q.add(x);
    }
    public static void reorder(Queue<Integer> q){
        int n = q.size();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n/2; i++){
            st.push(q.remove());
        }
        while(!st.isEmpty()) q.add(st.pop());
        for (int i = 0; i < n/2; i++){
            st.push(q.remove());
        }
        for (int i = 0; i < n/2; i++){
            q.add(st.pop());
            q.add(q.remove());
        }
        reverseQ(q);
            
       
    }
    public static void main(String[] args) {
        int[] arr = {1, 2 ,3 ,4 ,5 ,6, 7, 8};
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            q.add(arr[i]);
        }
        reorder(q);
        System.out.println(q);
    }
}
