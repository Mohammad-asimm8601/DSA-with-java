// find the minimum value out of all elements in the array.
package arrayP;

public class MinimumValue {
    public static void main(String args[]){
        int[] arr = {10, 33, 92, 7, 106, 750, 97, 2000, -14};
        int min = Integer.MAX_VALUE;
        for(int num : arr){
            min = Math.min(min, num);
        }
        System.out.println(min);
    }
}
