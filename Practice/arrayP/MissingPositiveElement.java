// WAP to find the smallest missing positive element in the sorted array.(take the array as input)
package arrayP;

import java.util.Scanner;

public class MissingPositiveElement {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n-1; i++) {
                if(arr[i+1] - arr[i] != 1){
                    System.out.println(arr[i]+1);
                    break;
                }
            }
        }
    
    }
}
