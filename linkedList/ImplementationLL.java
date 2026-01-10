package linkedlist;

class SLL{    // User defined Structure
    private Node head;
    private Node tail;
    private int size;
    void insertAtTail(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void insert (int idx, int val){
        if(idx == 0){
            insertAtHead(val);
            return;
        }
        if(idx == size){
            insertAtTail(val);
            return;
        }
        if(idx > size || idx < size){
            System.out.println("Invalid Index!");
            return;
        }
        Node temp = new Node(val);
        Node x = head;
        for (int i = 1; i <= idx-1; i++) {
            x = x.next;   
        }
        // insertion part
        temp.next = x.next;
        x.next = temp;
        size++;
    }
    int getElement(int idx) throws Error{
        if(idx == size-1) return tail.val;
        if(idx >= size || idx < 0){
            throw new Error("Invalid Index!");
        }
        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
    void set(int idx, int val){
        if(idx == size-1) tail.val = val;
         if(idx >= size || idx < 0){
            throw new Error("Invalid Index!");
        }
        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        temp.val = val;
        
    }
    void deleteAtHead() throws Error{
        if(head == null) throw new Error("List is Empty");
        head = head.next; 
        size--;
    }
    void delete(int idx) throws Error{
        if(idx == 0){
            deleteAtHead();
            return;
        }
        Node temp = head;
        if(idx <0 || idx > size) throw new Error("Invalid Index!");
        for (int i = 1; i <= idx-1; i++) {
            temp = temp.next;
        }
        if(temp.next == tail) temp = tail;
        temp.next = temp.next.next;
        size--;
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void size(){
        System.out.println("Size : "+size);
    }
}
public class ImplementationLL {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.size();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.size();
        list.display();
        list.insertAtTail(34);
        list.insertAtTail(67);
        list.insertAtHead(5);
        list.insert(2, 100);
        list.size();
        list.display();
        list.insert(10 , 100);
        System.out.println(list.getElement(2));
        // System.out.println(list.getElement(-1));
        list.set(2, 90);
        list.display();
        list.deleteAtHead();
        list.display();
        list.size();
        list.delete(2);
        list.display();
    }
}
