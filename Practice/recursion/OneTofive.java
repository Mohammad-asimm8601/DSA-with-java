package recursion;
import java.util.Scanner;
public class OneTofive {

    private static void print1to5(int n){
        if(n == 0) return;
        System.out.println(n);
        print1to5(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print1to5(n);
        sc.close();
    }
}
