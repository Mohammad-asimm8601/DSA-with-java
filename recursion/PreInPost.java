package recursion;

import java.util.Scanner;

public class PreInPost {
    public static void pip(int n){
        if(n == 0) return;
        System.out.println(n); // pre
        pip(n-1);
        System.out.println(n); //in
        pip(n-1);
        System.out.println(n); //post
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print ("Enter n : ");
            int n = sc.nextInt();
            pip(n);
        }
    }
}
