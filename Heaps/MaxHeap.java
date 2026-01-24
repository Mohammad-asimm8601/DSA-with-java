package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(2);
        pq.add(43);
        pq.add(-98);
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);
    }
}
