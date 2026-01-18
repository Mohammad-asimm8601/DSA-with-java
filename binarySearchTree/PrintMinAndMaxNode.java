package binarySearchTree;

import java.util.Scanner;

public class PrintMinAndMaxNode {
    public static Node minNode(Node root){
        if(root == null || root.left == null){
            return root;
        }
        return minNode(root.left);
    }
    public static Node maxNode(Node root){
        if(root == null || root.right == null){
            return root;
        }
        return maxNode(root.right);
    }
    public static Node insert(Node root, int x){
        if(root == null) return new Node(x);
        if(x < root.val){
            root.left = insert(root.left, x);
        }
        else if(x> root.val){
            root.right = insert(root.right, x);
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
            System.out.print("Size of tree : ");
            int n = sc.nextInt();
            Node root = null;
            System.out.print("Enter TreeNodes : ");
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                root = insert(root, x);
            }
            System.out.print("Output : ");
            display(root);
            System.out.println();
            System.out.println(minNode(root).val);
            System.out.println(maxNode(root).val);
        }
    }
}
