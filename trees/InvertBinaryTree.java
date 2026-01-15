package trees;

import java.util.Scanner;

public class InvertBinaryTree {
    public static void invert(Node root) {
        if (root == null)
            return;
        Node temp = (root.left);
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);

    }

    public static Node insert(Node root, int x) {
        if (root == null)
            return new Node(x);
        if (x < root.val) {
            root.left = insert(root.left, x);
        } else if (x > root.val) {
            root.right = insert(root.right, x);
        }
        return root;
    }

    public static void display(Node root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            Node root = null;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                root = insert(root, x);
            }
            System.out.print("Original tree : ");
            display(root);
            System.out.println();
            System.out.print("Invert tree : ");
            invert(root);
            display(root);
        }
    }
}
