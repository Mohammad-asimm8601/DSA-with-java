package Stack;
import java.util.Scanner;
import java.util.Stack;
public class InsertATBottomOrAnyIndex {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Stack<Integer> st = new Stack<>();
            System.out.print("Enter the number of element : ");
            int n = sc.nextInt();
            System.out.print("Enter the element : ");
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                st.push(x);
            }
            System.out.println(st);
            System.out.print("Enter the position : ");
            int pos = sc.nextInt();
            System.out.print("Enter the element you want to insert : ");
            int ele = sc.nextInt();

            Stack<Integer> rt = new Stack<>();
            while(st.size() > pos){
                rt.push(st.pop());
            }
            rt.push(ele);
            while(!rt.isEmpty()){
                st.push(rt.pop());
            }
            System.out.println(st);
        }
       
    }
}
