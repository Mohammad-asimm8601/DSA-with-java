package trees;

public class Traversal {
    private static void displayPreorder(Node root){
        if(root == null ) return;
        System.out.print(root.val+" ");
        displayPreorder(root.left);
        displayPreorder(root.right);
    }
    private static void displayInorder(Node root){
        if(root == null) return;
        displayInorder(root.left);
        System.out.print(root.val+" ");
        displayInorder(root.right);
    }
    private static void displayPostorder(Node root){
        if(root == null ) return;
        displayPostorder(root.left);
        displayPostorder(root.right);
        System.out.print(root.val+" ");
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(7);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e; b.right = f;
        System.out.print("PreOrder : ");
        displayPreorder(root);
        System.out.println();
        System.out.print("Inorder : "  );
        displayInorder(root);
        System.out.println();
        System.out.print("PostOrder : ");
        displayPostorder(root);
        System.out.println();
        
    }
}
