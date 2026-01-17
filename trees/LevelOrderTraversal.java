package trees;

import java.util.LinkedList;
import java.util.Queue;
public class LevelOrderTraversal {
    static class Pair{
        Node node;
        int val;
    
        public Pair(Node node, int val) {
             this.node = node;
             this.val = val;
        }
        
    }
    private static void levelOrder(Node root) {
        int prevlvl = 0;
        Queue<Pair> q = new LinkedList<>();
        if (root != null)
            q.add(new Pair(root, 0));
        while (!q.isEmpty()) {
            Pair front = q.remove();
            Node temp = front.node;
            int lvl = front.val;
            if(lvl != prevlvl) {
                System.out.println();
                prevlvl++;
            }
            System.out.print(front.node.val + " ");
            if (temp.left != null)
                q.add(new Pair(temp.left, lvl+1));
            if (temp.right != null)
                q.add(new Pair(temp.right, lvl+1));
        }
    
    }

    public static void display(Node root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(7);
        Node g = new Node(8);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
        f.left = g;
        System.out.print("PreOrder : ");
        display(root);
        System.out.println();
        System.out.print("Level order : ");
        levelOrder(root);
    }
}
