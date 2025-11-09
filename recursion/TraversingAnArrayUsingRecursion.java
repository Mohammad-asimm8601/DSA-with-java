// Traversing an array using recursion.
package recursion;

public class TraversingAnArrayUsingRecursion {
    public static void print(int i, int[] arr ){
        if(i == arr.length) return;
        System.out.print(arr[i]+" ");
        print(i+1, arr);
    }
    public static void main(String[] args) {
        int[] arr = { 4, 3, 6, 74, 46, 3, 6, 4, 66, 5, 6655, 6 };
        print(0, arr);
    }
}
