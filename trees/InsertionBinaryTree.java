package trees;

import java.util.*;

public class InsertionBinaryTree {
    static Node insert(Node root, int x){
        if(root == null) return new Node(x);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.poll();
            if(temp.left == null){
                temp.left = new Node(x);
                break;
            }else q.add(temp.left);
            if(temp.right == null){
                temp.right = new Node(x);
                break;
            }else q.add(temp.right);
        }
        return root;
    }
    private static void display(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            Node root = null;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                root = insert(root , x);
            }
            display(root);
        }
    }
}
