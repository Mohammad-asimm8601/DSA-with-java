package queue;

import java.util.*;

public class PrintQueueusingOperation {
    public static void print(Queue<Integer> q){
        Queue<Integer> temp = new LinkedList<>();
        while(!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            temp.add(q.remove());
        }
        while(!temp.isEmpty()){
            q.add(temp.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        print(q);
        System.out.println();
        System.out.println(q);
    }
}
