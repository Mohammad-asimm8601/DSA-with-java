package linkedList;

import java.util.*;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class RemoveKthEnd {
    static Node head = null;
    static Node tail = null;

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node removeKthElementFromEnd(Node head, int k) {
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= k; i++) {
            fast = fast.next;
        }
        if (fast == null)
            return head.next;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;

    }

    public static void main(String[] args) throws java.lang.Exception {
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
        Node x = removeKthElementFromEnd(head, k);
        print(x);

    }
}