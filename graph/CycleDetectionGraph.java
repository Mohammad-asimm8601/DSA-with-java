package graph;

import java.util.*;

public class CycleDetectionGraph {
    public static class Pair{
        int ver;
        int parent;

        public Pair(int ver, int parent) {
            this.ver = ver;
            this.parent = parent;
        }
        
    }
    public static boolean bfs(int i, int[][] adj, boolean[] vis){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i, -1));
        while(!q.isEmpty()){
            Pair front = q.remove();
            int node = front.ver;
            int parent = front.parent;
            for (int nei : adj[node]) {
                if(!vis[nei]){
                    vis[nei] = true;
                    q.add(new Pair(nei, node));
                }
                else if(nei != parent){
                    return true;
                }
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] adj = {{1},{0,2},{3,4,1},{2,4,5},{2,3},{3,6},{5}};
        int n = adj.length;
        boolean[] vis = new boolean[n];
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if(!vis[i]){
                flag = bfs(i, adj, vis);
            }
        }
        System.out.println(flag);
        
        
 
    }
}
