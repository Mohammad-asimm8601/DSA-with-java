package linkedlist;

import java.util.Scanner;

class Node{
    int val;
    Node next;
    public Node(int val) {
        this.val = val;
    }
    
}
public class SwappingNode {
    static Node head = null;
    static Node tail = null;

    public static Node swapNode(Node head, int k){
        Node start = head;
        Node slow = head;
        Node fast = head;
        for (int i = 1; i < k; i++) {
            start = start.next;
        }
        for (int i = 1; i <= k; i++) {
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        int temp = start.val;
        start.val = slow.val;
        slow.val = temp;
        return head;
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            Node temp = new Node(sc.nextInt());
            if (head == null)
                head = tail = temp;
            else {
                tail.next = temp;
                tail = temp;
            }
        }
        int k = sc.nextInt();
        Node ans = swapNode(head, k);
        print(ans);
    }
}
