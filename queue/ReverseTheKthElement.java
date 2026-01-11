// Reverse the first k elements of the queue.
package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseTheKthElement {
    public static void reverseQ(Queue<Integer> q, int k) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < k; i++) st.push(q.remove());
        while(!st.isEmpty()) q.add(st.pop());
        for (int i = 0; i < q.size()-k; i++) {
            int remove = q.remove();
            q.add(remove);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int k = sc.nextInt();
            Queue<Integer> q = new LinkedList<>();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            q.add(6);
            System.out.println(q);
            reverseQ(q, k);
            System.out.println(q);
        }
    }
}
