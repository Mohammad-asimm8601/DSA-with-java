package trees;

public class MaxVal {
    private static int max(Node root){
        if(root == null) return 0;
        int left = max(root.left);
        int right = max(root.right);
        int a =root.val;
        return Math.max(a, Math.max(left, right));

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(41);
        Node b = new Node(3);
        Node c = new Node(2);
        Node d = new Node(6);
        Node e = new Node(10);
        Node f = new Node(5);
        Node g = new Node(20);

        root.left = a; root.right = b;
        a.left = c; a.right = d;
        b.left = e; b.right = f;
        d.right = g;
        System.out.println(max(root));
    }
}
