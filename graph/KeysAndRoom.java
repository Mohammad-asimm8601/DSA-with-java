package graph;

import java.util.*;

public class KeysAndRoom {
    public static void bfs(int i, int[][] rooms, boolean[] vis){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while(!q.isEmpty()){
            int front = q.remove();
            for (int ele : rooms[front]) {
                if(!vis[ele]){
                    vis[ele] = true;
                    q.add(ele);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] rooms = { { 1, 3 }, { 3, 0, 1 }, { 2 }, { 0 } };
        int n = rooms.length;
        boolean[] vis = new boolean[n];
        vis[0] = true;
        bfs(0, rooms, vis);
        boolean flag = true;
        for (boolean ele : vis) {
            if(ele == false){
                flag = false;
                break;
            }
        }
        if(flag == false) System.out.println(false);
        else System.out.println(true);
    }
}
