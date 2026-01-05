package Stack;

public class ArrayImplementation {
    public static class Stack{
        private int[] arr = new int[5];
        private int  idx = 0;
        void push(int x){
            if(isFull()){
                System.out.println("Stack is full!");
                return;
            }
            arr[idx] = x;
            idx++;
        }
        int peek(){
            if(idx == 0){
                System.out.println("Stack is empty!");
                return -1;
            } 
            return arr[idx-1];
        }
        int pop (){
            if(idx == 0){
                System.out.println("Stack is empty!");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }
        void display(){
            for (int i = 0; i <=idx-1; i++) {
                System.out.print(arr[i]+" ");
            }
        }
        int size(){
            return idx; 
        }
        boolean isEmpty(){
            return idx == 0;
        }
        boolean isFull(){
            return idx == arr.length;
        }
        int capacity(){
            return arr.length;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println(st.isEmpty());
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.isEmpty()); 
        st.pop();
        st.display();
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st.isFull());
        System.out.println(st.capacity());
    }
}
