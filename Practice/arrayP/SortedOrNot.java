// Check if the given array is sorted or not
package arrayP;

public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {10, 13, 24, 65, 98};
        boolean flag = true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]) flag = false;
        }
        if(flag == true)System.out.println("Sorted");
        else System.out.println("Not Sorted!");
    }
}
