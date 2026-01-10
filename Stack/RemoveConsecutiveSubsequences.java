package Stack;
import java.util.Scanner;
import java.util.Stack;

public class RemoveConsecutiveSubsequences {
    public static int[]  subsequence(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(st.isEmpty() || st.peek() != arr[i]){
                st.push(arr[i]);
            }
            else if(arr[i] == st.peek()){
                if(i == n-1 || arr[i] != arr[i+1]) st.pop();
            }
        }
        int m = st.size();
        int[] res = new int[m];
        for (int i = m-1; i >=0; i--) {
            int top = st.pop();
            res[i] = top;
        }
        return res;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int[] rt = subsequence(arr);
            for (int i = 0; i < rt.length; i++) {
                System.out.print(rt[i]+" ");
            }
        }
    }
}
 