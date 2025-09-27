package string;

import java.util.Scanner;

public class StirngBuilderInput {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            StringBuilder sb = new StringBuilder(sc.nextLine());
            System.out.println(sb);
            sb.setCharAt(2, 'b');
            System.out.println(sb);
        }
    }
}
