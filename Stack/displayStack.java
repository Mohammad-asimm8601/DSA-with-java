package Stack;

import java.util.Stack;

public class displayStack {
    private static void displayRecuresively(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int top = stack.pop();
        displayRecuresively(stack);
        System.out.print(top+" ");
        stack.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(19);
        st.push(29);
        st.push(39);
        st.push(49);
        st.push(59);
        // System.out.println(st);
        // Stack<Integer> rt = new Stack<>();
        // while(!st.isEmpty()){
        // rt.push(st.pop());
        // }
        // while(!rt.isEmpty()){
        // System.out.print(st.push(rt.pop())+" ");
        // }
        // System.out.println(st);

        // display stack using array
        // int n = st.size();
        // int[] arr = new int[n];
        // for (int i = n-1; i >= 0; i--) {
        // arr[i] = st.pop();
        // }
        // for(int ele : arr){
        // System.out.print(ele+" ");
        // st.push(ele);
        // }
        // System.out.println(st);

        //  Using recursion
        displayRecuresively(st);
    }
}
