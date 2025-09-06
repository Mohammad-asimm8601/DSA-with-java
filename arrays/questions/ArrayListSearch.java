// Write a method in java that takes an ArrayList of integers and a target integer. The method should return the index of the first occurrence of the target integer in the arrayList. If the target integer is not found,, the method should return -1. implement this method and write a program to test it with user input.
package arrays.questions;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1; i<=n; i++){
             arr.add(sc.nextInt());
        }
        

        int target = sc.nextInt();
        int res = listSearch(arr, target);
        System.out.println(res);
    }
    public static int listSearch(ArrayList<Integer> arr, int target) {
        for (int i=0; i < arr.size(); i++) {
            if(arr.get(i) == target){
                return i;
            }   
        }
        return -1;
    }
}

