package graph;

import java.util.*;

public class NumberOfProvinces {

   public static void BFS(int i, boolean[] visit, int[][] adj) {
      int n = adj.length;
      visit[i] = true;
      Queue<Integer> q = new LinkedList<>();
      q.add(i);
      while (!q.isEmpty()) {
         int front = q.remove();
         for (int j = 0; j < n; j++) {
            if (adj[front][j] == 1 && visit[j] == false) {
               q.add(j);
               visit[j] = true;
            }
         }
      }
   }

   public static void main(String[] args) {

      try (Scanner sc = new Scanner(System.in)) {
         int n = sc.nextInt();
         int[][] adj = new int[n][n];
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               adj[i][j] = sc.nextInt();
            }
         }
         int count = 0;
         boolean[] visit = new boolean[n];
         for (int i = 0; i < n; i++) {
            if (!visit[i]) {
               BFS(i, visit, adj);
               count++;
            }
         }
         System.out.println(count);
      }
   }
}
