package linkedlist;

import java.util.Scanner;

class Node{
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
    
}
public class MiddleNode {
    static Node head = null;
    static Node tail = null;
    
    public static void print(){
        Node temp = head;
        if(temp == null ) return;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    public static void middle(int n){
        Node temp = head;
        for (int i = 0; i < n/2; i++) {
            temp = temp.next;
        }
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                Node temp = new Node(sc.nextInt());
                if(head == null) head = tail = temp;
                else {
                    tail.next = temp;
                    tail = temp;
                }
            }
            middle(n);
        }
    }
}
