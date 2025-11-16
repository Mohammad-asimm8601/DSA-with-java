package linkedList;

import java.util.Scanner;

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }

}

class LL {
    Scanner sc = new Scanner(System.in);
    Node head = null;
    Node tail = null;

    void deleteNode(Node target) {
        if (target == null || target.next == null) {
            System.out.println("Cannot delete this node!");
            return;
        }
        target.val = target.next.val;
        target.next = target.next.next;
    }

    Node findNode(int x) {
        Node temp = head;
        while (temp != null) {
            if (temp.val == x)
                return temp;
            temp = temp.next;

        }
        return null;
    }

    void deleteInput() {
        int x = sc.nextInt();
        Node target = findNode(x);
        deleteNode(target);
    }

    void input() {
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            Node temp = new Node(x);

            if (head == null)
                head = tail = temp;
            else {
                tail.next = temp;
                tail = temp;
            }
        }

    }

    void print() {
        Node temp = head;
        if (temp == null)
            return;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class DeleteNode {
    public static void main(String[] args) {
        LL list = new LL();
        list.input();
        list.print();
        list.deleteInput();
        list.print();
    }
}
