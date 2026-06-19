// count the number of elements strictly greater than x.
package arrayP;

import java.util.Scanner;

public class StrictlyGreater {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int[] arr = {10, 33, 92, 7, 106, 750, 97};

            int count = 0;
            for (int ele : arr) {
                if(ele >= x) count++;
            }
            System.out.println(count);
        }
    }
}
