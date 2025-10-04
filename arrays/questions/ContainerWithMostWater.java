/* 
  ## Container with most Water ##

You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.*/
package arrays.questions;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        int n = arr.length;
        int i = 0, j = n - 1;
        int max = 0;
        while (i < j) {
            int min = Math.min(arr[i], arr[j]);
            int value = (j - i) * min;
            if (max < value) {
                max = value;
            }

            if (arr[i] < arr[j] )
                i++;
            else 
                j--;  
        }
        System.out.println(max);
    }
}
