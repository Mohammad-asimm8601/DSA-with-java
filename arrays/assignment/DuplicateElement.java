// Write a program to find the duplicate elements from the given array of elements.
package arrays.assignment;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 5, 3, 5}; 
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]){
                    System.out.print(arr[i]+" ");
                   
                }
            }
        }
    }
}  