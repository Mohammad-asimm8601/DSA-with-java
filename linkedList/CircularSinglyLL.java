package linkedlist;
class SCLL{
    Node head;
    Node tail;
    int size;
    void insertAtTail(int val){
        Node temp = new Node(val);
        if(size == 0) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
            tail.next = head;
        }
        size++;
    }
    void insertAtHead(int val){
        Node temp = new Node(val);
        if(size == 0) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
            tail.next = temp;
        }
        size++;
    }
    void insert(int idx, int val) throws Error{
        Node temp = new Node(val);
        if(idx == 0){
            insertAtHead(val);
            return;
        }
        if(idx == size-1){
            insertAtTail(val);
            return;
        }
        if(idx < 0 || idx > size ){
            throw new Error("Invalid Index!");
        }
        else{
            Node  x = head;
            for (int i = 1; i <= idx-1; i++) {
                x = x.next;
            }
            temp.next = x.next;
            x.next = temp;
            size++;
        }
    }
    void deleteAtHead()throws Error{
        if(size == 0) throw new Error("List is empty!");
        else {
            tail.next = head.next;
            head = head.next;
            size--;
        }
    }
    void deleteAtTail(){
        if(size == 0) throw new Error("List is Empty!");
        else {
            Node temp = head;
            for (int i = 1; i <= size-2; i++) {
                temp = temp.next;
            }
            temp.next = head;
            tail = temp;
            size--;
        }
    }
    void delete(int idx) throws Error{
        if(idx == 0){
            deleteAtHead();
            return;
        }
        if(idx == size-1){
            deleteAtTail();
            return;
        }
        if(idx < 0 || idx > size){
            throw new Error("Invalid Index!");
        }
        else{
            Node temp = head;
            for (int i = 1; i <= idx-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }
    void display(){
        Node temp = head;
        while (true) { 
            System.out.print(temp.val+ " ");
            if(temp.next == head) break;
            temp = temp.next;
        }
        System.out.println();
    }
    void size(){
        System.out.println("size : " +size);
    }
}
public class CircularSinglyLL {
    public static void main(String[] args) {
        SCLL list = new SCLL();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtHead(5);
        list.insertAtHead(3);
        // list.insert(5, 8);
        list.deleteAtHead();
        list.deleteAtTail();
        list.delete(2);
        list.display();
        list.size();
    }
}
