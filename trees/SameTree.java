package trees;

public class SameTree {
    public static boolean isSameTree(Node p, Node q){
        if(p == null && q == null) return true;
        if(p == null && q != null) return false;
        if(p != null && q == null) return false;
        if(p.val != q.val  ) return false;
        if(!isSameTree(p.left, q.left)) return false;
        return isSameTree(p.right, q.right);
    }
    public static void display(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    public static void main(String[] args) {
        Node root1 = new Node(1);
        Node a1 = new Node(2);
        Node b1 = new Node(3);
        root1.left = a1; root1.right = b1;

        Node root2 = new Node(1);
        Node a2 = new Node(2);
        Node b2 = new Node(3);
        root2.left = a2; root2.right = b2;

        display(root1);
        System.out.println();
        display(root2);
        System.out.println();
        boolean flag = isSameTree(root1, root2);
        System.out.println(flag);
    }

}
