// Write a program to print sum of all the element of a 2D matrix.
package multidimensionarray.questions;

public class SumOfAllElement {
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 4, 5},{34, 6, 6, 7}, { 65, 64, 46, 4}};
        int sum = 0;
        for(int[] ele : arr){
            for(int x : ele){
                sum += x;
            }
        }
        System.out.println(sum);
    }
}
