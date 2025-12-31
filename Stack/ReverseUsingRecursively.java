package Stack;

import java.util.Stack;

public class ReverseUsingRecursively {
    private static void stackRev(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        System.out.print(top+" ");
        stackRev(st);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        stackRev(st);
    }
}
