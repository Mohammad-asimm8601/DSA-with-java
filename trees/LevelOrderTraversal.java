package trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    private static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        if (root != null)
            q.add(root);
        while (!q.isEmpty()) {
            Node front = q.remove();
            System.out.print(front.val + " ");
            if (front.left != null)
                q.add(front.left);
            if (front.right != null)
                q.add(front.right);
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
