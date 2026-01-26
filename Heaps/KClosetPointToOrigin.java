package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;


public class KClosetPointToOrigin {
    public static class Triplet implements Comparable<Triplet>{
        int d;
        int x;
        int y;

        public Triplet(int d, int x, int y) {
            this.d = d;
            this.x = x;
            this.y = y;
        }
        @Override
        public int compareTo(Triplet t){
            return this.d - t.d;
        }
        
    }
    public static void main(String[] args) {
        int[][] arr = { { 3, 3 }, { 5, -1 }, { -2, 4 }, { 1, 0 }, { 3, 2 } };
        int k = 2;
        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int[] arr1 : arr) {
            int x = arr1[0];
            int y = arr1[1];
            int d = x*x + y*y;
            pq.add(new Triplet(d, x, y));
            if(pq.size() > k) pq.remove();
        }
        int[][] ans = new int[k][2];
        for (int i = 0; i < k; i++){
            Triplet t = pq.remove();
            ans[i][0] = t.x;
            ans[i][1] = t.y;
        }
        for (int[] an : ans) {
            int x = an[0];
            int y = an[1];
            System.out.println(x+" "+y);
        }

        
    }
}
