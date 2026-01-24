package Heaps;

import java.util.PriorityQueue;

public class BasicHeapCF{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(2);
        pq.add(10);
        pq.add(1);
        pq.remove();
        pq.add(0);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.size());
    }
}
