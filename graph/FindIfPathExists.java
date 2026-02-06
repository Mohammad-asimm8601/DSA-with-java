package graph;

import java.util.*;

public class FindIfPathExists {
    public static void main(String[] args) {
        int n = 6;
        int[][] edges = {{0,1},{0,2},{3,5},{5,4},{4,3}};
        int source = 0;
        int destination = 5;
        // int len = edges.length;
        // if(source == destination) System.out.println(true);
        boolean[] vis = new boolean[n];
        List<List<Integer>> adj =  new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>()); 
        }
        for (int i = 0; i < edges.length; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        vis[source] = true;
        bfs(source, adj, vis);
        System.out.println(vis[destination]);
    }

    private static void bfs(int source, List<List<Integer>> adj, boolean[] vis) {
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        while(!q.isEmpty()){
            int front = q.remove();
            for (int ele : adj.get(front)) {
                if(!vis[ele]){
                    vis[ele] = true;
                    q.add(ele);
                }
            }
        }

    }
        
}
    