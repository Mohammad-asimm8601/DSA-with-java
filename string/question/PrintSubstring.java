// Input a string and print all the substrings of that string.
package string.question;

public class PrintSubstring {
    public static void main(String[] args) {
        String s = "abcde";
        int n = s.length();

        // // method -1
        // for (int i = 0; i < n; i++) {
        //     for (int j = i; j < n; j++) {
        //         for (int k = i; k <= j; k++) {
        //             System.out.print(s.charAt(k));
        //         }
        //         System.out.print(" ");
        //     }
        // }

        // method - 2
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <= n; j++) {
                System.out.print(s.subSequence(i, j)+" ");
            }
            System.out.println();
        }
    }
}
