package Stack;

import java.util.Stack;

public class BasicStack {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        // System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.peek());

        // to access first element inserted in stack
        while(st.size() > 1){
            st.pop();
        }

        // size has become 1
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.isEmpty());

    }
}
