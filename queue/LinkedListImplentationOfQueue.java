package queue;

public class LinkedListImplentationOfQueue {
    public static class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
        
    }
    public static class queueLL{
        Node head = null;
        Node tail = null;
        int size = 0;
        public void add(int x){
            Node temp = new Node(x);
            if(size == 0) head = tail = temp;
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        public int peek(){
             if(size == 0) {
                System.out.println("Queue is Empty!");
                return -1;
            }
            else return head.val;
        }
        public int remove(){
            if(size == 0) {
                System.out.println("Queue is Empty!");
                return -1;
            }
            else{
                int ele = head.val;
                head = head.next;
                size--;
                return ele;
            }
        }
        public int size(){
            return size;
        }
        public boolean isEmpty(){
            return size == 0;
        }
        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queueLL q = new queueLL();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.display();
        System.out.println(q.peek());
        System.out.println(q.remove());
        q.display();
        System.out.println(q.size());
        System.out.println(q.isEmpty());

    }
}
