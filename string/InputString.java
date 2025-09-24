package string;

import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your name : ");
            String str = sc.nextLine();
            System.out.print("Hi ");
            System.out.println(str+"!");
        }
    }
}
