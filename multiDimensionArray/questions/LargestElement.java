// Write a java program to find the largest element of a given 2D Array of integers.
package multidimensionarray.questions;

public class LargestElement {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 56}, {45, 65, 89}, { 13, 16, 19}};

        int max = Integer.MIN_VALUE;
        for(int[] ele : arr){
            for(int x : ele){
                if(x > max){
                    max = x;
                }
            }
        }
        System.out.println(max);
    }
}
