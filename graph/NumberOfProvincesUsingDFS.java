package graph;

public class NumberOfProvincesUsingDFS {
    public static void main(String[] args) {
        int[][] adj = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };
        int n = adj.length;
        boolean[] vis = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(!vis[i]){
                dfs(i, adj, vis);
                count++;
            }
        }
        System.out.println(count);
    }

    private static void dfs(int i, int[][] adj, boolean[] vis) {
        vis[i] = true;
        int n = adj.length;
        for (int j = 0; j < n; j++) {
            if(adj[i][j] == 1 && vis[i] == false){
                dfs(i, adj, vis);
            }
        }

    }
}
