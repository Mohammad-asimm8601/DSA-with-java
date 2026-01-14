package trees;

public class LevelofTree {
    public static int level(Node root){
        if(root == null) return 0;
        int left = level(root.left);
        int right = level(root.right);
        return 1 + Math.max(left ,right) ;
    }
    public static void display(Node root){
        if(root == null ) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
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
        Node h = new Node(21);
        root.left = a; root.right = b;
        a.left = c; a.right = d;
        b.left = e; b.right = f;
        d.right = g; g.right = h;
        display(root);
        System.out.println();
        System.out.println(level(root));
    }
}
