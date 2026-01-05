package Stack;

class Node{
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
    
}
class Stack{   // User defined data structure
    Node head = null;
    int size = 0;
    void push(int x){
        Node temp = new Node(x);
        if(size == 0){
            temp.next = null;
        }
        else{
            temp.next = head;
        }
        head = temp;
        size++;

    }
    int pop(){
        int top = head.val;
        head = head.next;
        size--;
        return top;
    }
    int size(){
        return size;
    }
    boolean isEmpty(){
        return size == 0;
    }
    void displayrec(Node h){
        if(h == null ) return;
        displayrec(h.next);
        System.out.print(h.val+" ");
    }
    void display(){
        displayrec(head);
    }
    void displayRev(){
        Node temp = head;
        if(isEmpty()) System.out.println("Stack is empty!");
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class LinkedlistImplemntation {
    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println(st.isEmpty());
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.displayRev();
        System.out.println(st.size());
        System.out.println(st.pop());
        System.out.println(st.size());
        st.displayRev();
        System.out.println(st.isEmpty());
        st.display();

    }
}
