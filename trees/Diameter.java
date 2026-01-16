package trees;

public class Diameter {
    
    public static int height(Node root){
        if(root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        return 1 + Math.max(left, right);
        
    }
    public static int diameter(Node root){
        if(root == null) return 0;
        int myDia = height(root.left) + height(root.right);
        int leftDia = diameter(root.left);
        int rightDia = diameter(root.right);
        return Math.max(myDia, Math.max(leftDia, rightDia));
    }
    public static void display(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    public static void main(String[] args) {
        Node root  = new Node(1);
        Node a = new Node(2);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(4);
        Node f = new Node(3);
        Node g = new Node(5);
        Node h = new Node(6);
        Node i = new Node(8);
        root.left = a; root.right = b;
        a.left = c; a.right = d;
        b.left = e; b.right = f;
        d.left = g; f.left = h;
        g.right = i;
        display(root);
        System.out.println();
        System.out.println(diameter(root));
    }
}
