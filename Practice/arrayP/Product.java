// Calculate the product of all the elements in the given array.

package arrayP;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of element : ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter element : ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int product = 1;
            for(int ele : arr){
                product *= ele;
            }
            System.out.println("Product of array  = "+product);
            sc.close();
        }
        
    }
}
