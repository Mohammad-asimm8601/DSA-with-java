package Stack;

import java.util.Stack;

public class UnderflowOverflow {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        // Underflow :: if stack is empty -> st.peek() or st.pop() the compiler give error
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);

        // Overflow :: if stack is full & you trying to st.push(), -> Error
        // condition :: Actual memory is full or fixed memory data structure.
    }
}
