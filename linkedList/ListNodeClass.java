package linkedlist;

class Node{
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
    
}
public class ListNodeClass {
    public static  void print(Node head){
        if(head == null){
            return;
        }
        System.out.print(head.val+" ");
        print(head.next);
       
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(67);
        a.next = b;  // 10 -> 20
        b.next = c;   // 10 -> 20 -> 30
        c.next = d;   // 10 -> 20 -> 30 -> 40
        d.next = e;   // 10 -> 20 -> 30 -> 40 -> 50
        e.next = f;
        print(a);

       
       
    }
}

