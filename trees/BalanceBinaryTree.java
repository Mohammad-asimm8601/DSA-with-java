package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BalanceBinaryTree {
    static boolean ans;
    public static int levels(Node root){
        if(root == null) return 0;
        int left = levels(root.left);
        int right = levels(root.right);
        int diff = Math.abs(left - right);
        if(diff > 1) ans = false;
        return  1 + Math.max(left, right);
    }
    public static Node buildTree(Scanner sc , int n){
        if(n == 0) return null;
        int rootval = sc.nextInt();
        if(rootval == -1) return null;
        Node root = new Node(rootval);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int count = 1;
        while(!q.isEmpty() && count < n){
            Node temp = q.poll();

            // left child
            int leftval = sc.nextInt();
            count++;
            if(leftval != -1){
                temp.left = new Node(leftval);
                q.add(temp.left);
            }
            if(count >= n) break;

            // right child
            int rightval = sc.nextInt();
            count++;
            if(rightval != -1){
                temp.right = new Node(rightval);
                q.add(temp.right);
            }
        }
        return root;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node root = buildTree(sc, n);
        ans = true;
        levels(root);
        System.out.println(ans);
    }
}
