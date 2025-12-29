package Stack;
import java.util.Stack;
public class ReverseAStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        System.out.println(st);

        Stack<Integer> rSt = new Stack<>();
        while(!st.isEmpty()){
            int element = st.pop();
            rSt.push(element);
        }
        System.out.println(rSt);
    }
}
