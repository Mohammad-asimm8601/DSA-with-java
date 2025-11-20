package linkedList;

import java.util.Scanner;

class Node{
    int val;
    Node next;
    public Node(int val) {
        this.val = val;
    }   
}
public class IntersecttionOfTwo {
    static Node headA = null;
    static Node tailA = null;
    static Node headB = null;
    static Node tailB = null;
    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for (int i = 1; i <=m; i++) {
            Node listA = new Node(sc.nextInt());
            if(headA == null) headA = tailA = listA;
            else{
                tailA.next = listA;
                tailA = listA;
            }
        }
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            Node listB = new Node(sc.nextInt());
            if(headB == null) headB = tailB = listB;
            else{
                tailB.next = listB;
                tailB = listB;
            }
        }
        print(headA);
        print(headB);
    
    }
}
