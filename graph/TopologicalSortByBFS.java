package graph;
import java.util.*;
public class TopologicalSortByBFS {
    public static void main(String[] args) {
        int[][] adj = {{2,3},{2,4},{},{2},{2,3}};
        int n = adj.length;
        int[] indegree = new int[n];
        
        // calculate in degree
        for (int i = 0; i < n; i++) {
            for (int ver : adj[i]) {
                indegree[ver]++;    
            }
        }

        Queue<Integer> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if(indegree[i] == 0) q.add(i);
        }
        while(!q.isEmpty()){
            int front = q.remove();
            ans.add(front);

            for (int nei : adj[front]) {
                indegree[nei]--;
                if(indegree[nei] == 0){
                    q.add(nei);
                }
            }
        }
        System.out.println(ans);
    }
}
