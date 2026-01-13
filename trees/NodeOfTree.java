package trees;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
    
}
public class NodeOfTree {
    private static void display(TreeNode root){
        if(root == null ) return;
        System.out.print(root.val+" ");  //preorder
        display(root.left);
        display(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode b = new TreeNode(4);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(2);
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(5);
        root.left = b; root.right = c;
        b.left = d; b.right = e;
        c.right = f;
        // root.left  = null;
        // System.out.println(root.right.right.val);
        display(root);
    }
}
 