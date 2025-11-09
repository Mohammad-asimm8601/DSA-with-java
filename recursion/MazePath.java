// Given a mxn grid. You have to reach from top left corner to bottom to right corner. you can go either down or right at a time. Find the no. of paths.
package recursion;

import java.util.Scanner;

public class MazePath {
    public static int path(int m, int n){
        if(m == 1 || n ==1) return 1;
        return path(m, n-1) + path(m-1, n);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter m : ");
            int m = sc.nextInt();
            System.out.print("Enter n : ");
            int n = sc.nextInt();
            System.out.println(path(m,n));
        }
    }
}
