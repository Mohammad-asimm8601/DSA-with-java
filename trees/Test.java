package trees;
import java.util.*;

public class Test
{   
    public static void levelwise(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root != null)
            q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node front = q.poll();
                System.out.print(front.val+" ");
                if(front.left != null) q.add(front.left);
                if(front.right != null) q.add(front.right);
            }
            System.out.println();
        }
    }
    public static Node buildTree(Scanner sc , int n){
        if(n == 0) return null;
        int rootval = sc.nextInt();
        if(rootval == -1) return null;
        Node root = new Node(rootval);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int count = 1;
        while(!q.isEmpty() && count < n){
            Node temp = q.poll();

            // left child
            int leftval = sc.nextInt();
            count++;
            if(leftval != -1){
                temp.left = new Node(leftval);
                q.add(temp.left);
            }
            if(count >= n) break;

            // right child
            int rightval = sc.nextInt();
            count++;
            if(rightval != -1){
                temp.right = new Node(rightval);
                q.add(temp.right);
            }
        }
        return root;
    }
    public static void display(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            Node root = buildTree(sc, n);
            // display(root);
            levelwise(root);

        }
	}
}