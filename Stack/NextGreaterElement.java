package Stack;
import java.util.Stack;
public class NextGreaterElement {
    public static int[] nextGreater(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for (int i = n-1; i >= 0; i--) {
            if(st.isEmpty()) st.push(-1);
            else if(arr[i] < arr[i+1]) st.push(arr[i+1]);
            else if(st.peek() > arr[i] ) st.push(st.peek());
            else{
                st.push(-1);
            }
            
        }
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = st.pop();        }

        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 8, 6, 3, 4};
        int[] res = nextGreater(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
 