package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TopologicalSort {
    public static void main(String[] args) {
        int[][] adj = { { 1 }, { 2, 3 }, { 3, 4 }, {}, { 3 } };
        int n = adj.length;
        boolean[] vis = new boolean[n];
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                dfs(0, ans, vis, adj);
            }
        }
        Collections.reverse(ans);
        System.out.println(ans);

    }

    private static void dfs(int i, List<Integer> ans, boolean[] vis, int[][] adj) {
        vis[i] = true;
        for (int ele : adj[i]) {
            if (!vis[ele]) {
                dfs(ele, ans, vis, adj);
            }
        }
        ans.add(i);

    }
}
