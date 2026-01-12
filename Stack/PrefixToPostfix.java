package Stack;
import java.util.Stack;
public class PrefixToPostfix {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<String> val = new Stack<>();
        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);
            if(ch >= 48 && ch <= 57){
                String s = ""+ch;
                val.push(s);
            }
            else{
                String v1 = val.pop();
                String v2 = val.pop();
                String t = v1 + v2 + ch;
                val.push(t);

            }
        }
        System.out.println(val.pop());
    }
}
