/*  Rotate the given array 'a' by k steps, where j is the non- negative number.

Note: k can be greater than n as well where n is the size of array 'a'.
*/
package arrays.questions;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        

        for(int ele : a){
            System.out.print(ele+" ");
        }
        System.out.println();
        int k = sc.nextInt();
        rotate(a, k);
        // for(int ele : a ){
        //     System.out.print(a[ele]+" ");
        // }
        
        
    }
    public static void rotate(int[] a, int k) {
        int n = a.length;
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            if(i < k){
                b[i] = a[n-k+i];
                
            }
            else{
                b[i] = a[i-k];
            }
            
        }
        
        
    }
}
