package multidimensionarray;

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }

}

class LL {
    private Node head;
    private Node tail;
    private int size;

    void insertAtHead(int val) {
        Node temp = new Node(val);
        if (head == null)
            head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void insertAtTail(int val) {
        Node temp = new Node(val);
        if (head == null)
            head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void insert(int idx, int val) throws Error {
        if (idx == 0)
            insertAtHead(val);
        if (idx == size)
            insertAtTail(val);
        if (idx < 0 || idx > size)
            throw new Error("Invalid Index!");
        Node temp = new Node(val);
        Node x = head;
        for (int i = 1; i <= idx - 1; i++) {
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;
        size++;
    }
    int getElement(int idx) throws Error {
        if (idx == size - 1)
            return tail.val;
        if (idx < 0 || idx >= size)
            throw new Error("Invalid Index!");
        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.val;

    }
    void set(int idx, int val) throws Error {
        if (idx == size - 1)
            tail.val = val;
        if (idx < 0 || idx >= size)
            throw new Error("Invalid Index!");
        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        temp.val = val;
    }
    void deleteAtHead() throws Error {
        if (head == null)
            throw new Error("List is Empty");
        head = head.next;
        size--;
    }
    void delete(int idx) throws Error {
        if (idx == 0) {
            deleteAtHead();
            return;
        }
        if (idx < 0 || idx >= size)
            throw new Error("Invalid Index!");
        Node temp = head;
        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.next;
        }
        if (temp.next == tail)
            temp = tail;
        temp.next = temp.next.next;
        size--;

    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void size() {
        System.out.println("Size : " + size);
    }
    // void print(Node head) {
    //     if (head == null) {
    //         return;
    //     }
    //     System.out.print(head.val + " ");
    //     print(head.next);
    // }

}

public class RELL {
    public static void main(String[] args) {
        LL list = new LL();
        // Node a = new Node(10);
        // Node b = new Node(20);
        // Node c = new Node(30);
        // Node d = new Node(40);
        // Node f = new Node(50);
        // Node g = new Node(60);
        // a.next = b;
        // b.next = c;
        // c.next = d;
        // d.next = f;
        // f.next = g;
        // list.print(a);
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtHead(5);
        list.insert(2, 15);
        list.set(3, 34);
        list.deleteAtHead();
        list.delete(1);
        list.display();
        System.out.println(list.getElement(0));
        list.size();
    }
}
