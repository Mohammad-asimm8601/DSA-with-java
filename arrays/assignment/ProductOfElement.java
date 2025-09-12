// Calculate the product of all the elements in the given array.
package arrays.assignment;
import java.util.Scanner;
public class ProductOfElement {
    public static int product(int[] arr){
        int total = 1;
        for (int ele : arr) {
            total *= ele;
        }
        return total; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Product array element is: " +product(arr));

        sc.close();
    }
    
}
