package Stack;

import java.util.Scanner;
import java.util.Stack;

public class CopyOfAStack {
   
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Stack<Integer> st = new Stack<>();
            int n;
            System.out.print("Enter the number of elements : ");
            n = sc.nextInt();
            System.out.print("Enter the element: ");
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                st.push(ele);
            }
            System.out.println(st);
            // reverse order and copy 
            Stack<Integer> rev = new Stack<>();
            while(!st.isEmpty()){
                int x = st.pop();
                rev.push(x);
            }
            System.out.println(rev);
            Stack<Integer> copy = new Stack<>();
            while(!rev.isEmpty()){
                int x = rev.pop();
                copy.push(x);
            }
            System.out.println(copy);
            
        }
    }
}
