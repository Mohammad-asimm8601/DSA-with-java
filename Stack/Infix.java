package Stack;
import java.util.Stack;

public class Infix {
    public static void main(String[] args) {
        String str = "9-5+3*4/6";

        Stack<Integer> num = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // if digit
            if (ch >= '0' && ch <= '9') {
                num.push(ch - '0');
            }
            // if operator
            else {
                while (!op.isEmpty() && precedence(op.peek()) >= precedence(ch)) {
                    int v2 = num.pop();
                    int v1 = num.pop();
                    char oper = op.pop();
                    num.push(apply(v1, v2, oper));
                }
                op.push(ch);
            }
        }

        // final evaluation
        while (num.size() > 1) {
            int v2 = num.pop();
            int v1 = num.pop();
            char oper = op.pop();
            num.push(apply(v1, v2, oper));
        }

        System.out.println(num.peek());
    }

    static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        return 2; // * /
    }

    static int apply(int a, int b, char op) {
        if (op == '+') return a + b;
        if (op == '-') return a - b;
        if (op == '*') return a * b;
        return a / b;
    }
}
