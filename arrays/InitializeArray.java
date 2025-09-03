package arrays;
import java.util.Scanner;
public class InitializeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Another type initialize Array
        // int[] arr = {10, 20, 30, 40, 50};
        // int n = arr.length;
        // System.out.println(n);

        // input -> loop
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        // output -> loop
        for (int i = 0; i< n; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
