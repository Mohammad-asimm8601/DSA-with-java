package queue;

public class CircularQueueArray {
    public static class Cqa{
        int front= -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[8];

        public void add(int x) throws Exception{
            if (size == arr.length){
               throw new Exception("Queue is full!");
            }
            else if(size == 0){
                front = rear = 0;
                arr[rear] = x;
            }
            else if(rear < arr.length-1){
                arr[++rear] = x;
            }
            else if(rear == arr.length-1)
                rear = 0;
                arr[rear] = x;
            size++;

        }
        public int remove() throws Exception{
            if (size == 0) throw new Exception("Queue is empty!");
            else{
                int val = arr[front];
                if(front == arr.length-1) front =0;
                else front++;
                size--;
                return val;
            }   
        }
        public int peek() throws Exception{
            if (size == 0) throw new Exception("Queue is empty!");
            else return arr[front];
        }
        public boolean isEmpty(){
            return size == 0;
        }
        public int size(){
            return size;
        }
        public  void display(){
            if(size == 0) System.out.println("Queue is Empty!");
            else{
                if(front <= rear){
                    for (int i = front; i <=  rear; i++) {
                        System.out.print(arr[i]+" ");
                    }
                }
                else{
                    for (int i = front; i < arr.length; i++) {
                        System.out.print(arr[i]+" ");
                    }
                    for (int i = 0; i <= rear; i++) {
                        System.out.print(arr[i]+" ");
                    }
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception{
        Cqa c = new Cqa();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);
        System.out.println(c.size());
        c.display();
        c.remove();
        c.display();
        c.add(6);
        c.add(7);
        c.add(8);
        c.add(9);
        c.display();
        System.out.println(c.peek());
    }
    
}

