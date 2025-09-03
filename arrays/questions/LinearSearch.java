// Find the element 'x' in the array. take array and x as input
package arrays.questions;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter target element: ");
        int x = sc.nextInt();
        System.out.print("Enter size : ");
        int size = sc.nextInt();
        System.out.print("Enter Array element: ");
        int[] arr = new int[size];
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // solution
        boolean flag = false;   // false means not found
        for (int i = 0; i < n; i++) {
            if(arr[i] == x){
                flag = true;   // true means found
                break;
            } 
        }
        if(flag == true)System.out.println("Element Found");
        else System.out.println("Element not Found!");
        sc.close();
    }
}
