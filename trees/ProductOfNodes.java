package trees;

public class ProductOfNodes {
    private static int sumofNodes(Node root){
        if(root == null){
            return 1;
        }
        return root.val * sumofNodes(root.left) * sumofNodes(root.right);
    }
    private static void display(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
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
        root.left = a; root.right = b;
        a.left = c; a.right = d;
        b.right = e;
        display(root);
        System.out.println();
        int sum = sumofNodes(root);
        System.out.println(sum);
    }
}
