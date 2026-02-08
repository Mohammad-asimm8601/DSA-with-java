package graph;

public class KeysAndRoomsDFS {
    public static void main(String[] args) {
        int[][] rooms = {
                { 1, 3 },
                { 3, 0, 1 },
                { 2 },
                { 0 }
        };
        int n = rooms.length;
        boolean[] vis = new boolean[n];
        vis[0] = true;
        dfs(0, rooms, vis);
        boolean flag = true;
        for (boolean ele : vis) {
            if (ele == false) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
        
    }

    private static void dfs(int i, int[][] rooms, boolean[] vis) {
        vis[i] = true;
        for (int ele : rooms[i]) {
            if(!vis[ele])dfs(ele, rooms, vis);

        }
    }
}
