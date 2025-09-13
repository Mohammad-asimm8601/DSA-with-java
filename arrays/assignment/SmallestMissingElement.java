// Write to find the smallest missing positive element in the sorted array. (take the array as input)
package arrays.assignment;

import java.util.Scanner;

public class SmallestMissingElement {
    public static int missing(int[] arr){
        int n = arr.length;
        int i=0, j=i+1;
        while(j < n){
            if(arr[j]-arr[i] > 1){
                int res =  arr[i] + 1;
                return res;
            }
            i++; j++;
            
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(missing(arr));
        
    }

}
