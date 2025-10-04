package multidimensionarray.questions;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for (int i = 1; i < n; i+=i) {
                System.out.println(i);
            }
        }
    }
}
