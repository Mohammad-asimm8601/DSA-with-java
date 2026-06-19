// Find the factorial of a large number.
// Hint :- use an array to store every digit of answer.

package arrayP;

public class Factorial {
    public static void main(String[] args) {
        int n = 20;
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *=i;
        }
        System.out.println(fact);
    }
}
