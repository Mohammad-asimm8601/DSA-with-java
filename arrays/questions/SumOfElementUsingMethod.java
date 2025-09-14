// Write a method in java that takes an array of integers and returns the sum of all the elements in the array. Implement this method and write a program to test it with user input.
package arrays.questions;

import java.util.Scanner;

public class SumOfElementUsingMethod {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            int[] array = new int[n];
            for(int i=0; i< n ; i++){
                array[i] = sc.nextInt();
            }

            int sum = calculateSum(array);
            System.out.println(sum);
        }
    }

    public static int calculateSum(int[] array){
        int sum = 0;
        for(int num : array){
            sum += num;
        }
        return sum;
    }
}
