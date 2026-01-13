package trees;

public class ProductOfNonZerosNodes {
    private static int sumofNodes(Node root){
        if(root == null){
            return 1;
        }
        int left = sumofNodes(root.left);
        int right = sumofNodes(root.right);
        if(root.val != 0){
            return root.val * left * right;
        }
        else{
            return left * right;
        }
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
        Node c = new Node(0);
        Node d = new Node(5);
        Node e = new Node(0);
        root.left = a; root.right = b;
        a.left = c; a.right = d;
        b.right = e;
        display(root);
        System.out.println();
        int sum = sumofNodes(root);
        System.out.println(sum);
    }
}
