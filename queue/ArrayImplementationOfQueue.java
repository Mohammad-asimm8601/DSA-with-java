package queue;

public class ArrayImplementationOfQueue {
    public static class queueA{
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr  = new int[5];
        public void add (int val){
            if(r==arr.length-1) {
                System.out.println("Queue is full!");
                return;
            }
            if(f == -1){
                f = r = 0;
                arr[r] = val;
            }
            else{
                arr[++r] = val;
                
            }
            size++;
        }
        public int remove(){
            if(size == 0) {
                System.out.println("Queue is empty!");
                return -1;
            }
            f++;
            size--;
            return arr[f-1];
        }
        public int peek(){
            if(size == 0) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[f];
        }
        public boolean isEmpty(){
            return size == 0;
        }
        public void display(){
            if(size == 0){
                System.out.println("Queue is Empty!");
            }
            else{
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
        public int size(){
            return size;
        }
    }
    public static void main(String[] args) {
        queueA q = new queueA();
        q.display();
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.display();
        System.out.println(q.remove());
        q.display();
        System.out.println(q.peek());
        q.display();
    }
}
