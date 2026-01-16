package trees;

public class PrintsElementNthLevels {
    static int n;
    public static void display(Node root, int level ){
        if(root == null) return;
        if(level == n){
            System.out.print(root.val+" ");
        }
        display(root.left, level+1);
        display(root.right, level+1);
    }
    public static void main(String[] args) {

            Node root = new Node(1);
            Node a = new Node(7);
            Node b = new Node(9);
            Node c = new Node(2);
            Node d = new Node(6);
            Node e = new Node(9);
            Node f = new Node(5);
            Node g = new Node(11);
            Node h = new Node(5);
            root.left = a; root.right = b;
            a.left = c; a.right = d;
            b.right = e;
            d.left = f; d.right= g;
            e.left = h;
            for (int i = 0; i <= 3; i++) {
                n = i;
                display(root, 0);
            }
    }
}
