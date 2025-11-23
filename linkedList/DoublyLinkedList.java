package linkedList;

class dNode {
    int val;
    dNode next;
    dNode prev;

    public dNode(int val) {
        this.val = val;
    }
}

class DLL {
    dNode head;
    dNode tail;
    int size;

    void display() {
        dNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void size(){
        System.out.println("Size : "+size);
    }
    void insertAtTail(int val){
        dNode temp = new dNode(val);
        if(size == 0) head = tail = temp;
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }
    void insertAtHead(int val){
        dNode temp = new dNode(val);
        if(size == 0) head = tail = temp;
        else{
            head.prev = temp;
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void insert(int idx, int val){
        if(idx == 0){
            insertAtHead(val);
            return;
        }
        if(idx == size){
            insertAtTail(val);
            return;
        }
        if(idx < 0 || idx > size){
            System.out.println("Invalid Index!");
            return;
        }
        dNode temp = new dNode(val);
        dNode x = head;
        for (int i = 1; i <= idx-1; i++) {
            x = x.next;
        }
        dNode y = x.next;
        x.next = temp; temp.prev = x;
        temp.next = y; y.prev = temp;
        size++;
    }

}

public class DoublyLinkedList {
    public static void print(dNode head) {
        dNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void printReverse(dNode tail) {
        dNode temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void display(dNode node) {
        dNode temp = node;
        while (temp.prev != null) {
            temp = temp.prev;
        }
        print(temp);
    }

    public static void main(String[] args) {
        // dNode a = new dNode(10);
        // dNode b = new dNode(20);
        // dNode c = new dNode(30);
        // dNode d = new dNode(40);
        // a.next = b;
        // b.prev = a;
        // b.next = c;
        // c.prev = b;
        // c.next = d;
        // d.prev = c;
        // print(a);
        // printReverse(d);
        // display(c);
        DLL list = new DLL();
        list.display();
        list.insertAtTail(10);
        list.insertAtTail(20  );
        list.display();
        list.size();
        list.insertAtHead(5);
        list.display();
        list.size();
        list.insert(2, 12);
        list.display();
        list.size();
    }
}
