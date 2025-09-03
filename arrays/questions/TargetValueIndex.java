// Given 1D array of integers and a target value, determine if the target value is not present in the array. if it is present, print the index of its first occurrence. if it is not present, print -1.
package arrays.questions;

import java.util.Scanner;

public class TargetValueIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int targ = sc.nextInt();
        int res = linearSearch(arr, targ);

        if(res == -1){
            System.out.println(-1);
        }else{
            System.out.println(res);
        }
    }

    public static int linearSearch(int[] arr, int targ){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == targ){
                return i;
            }
        }
        return -1;
    }
}