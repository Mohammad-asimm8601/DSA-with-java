// Given an array with N distinct elements, convert the given array to a form where all the elements are in the range from 0 to n-1. The order of elements is the same , i.e., 0 is placed in the place of the smallest element, 1 os placed for the second smallest element, ... N-1 is palced for the largest element.
package BasicSorting.Question;

public class PutIndexWithIncreaseTheArray {
    public static void main(String[] args) {
        int[] arr = {54, 11, 28, 98, 47, 63};
        int n = arr. length;
        for (int i = 0; i < n; i++) {
            int min  = Integer.MAX_VALUE;
            int mindx = 0;
            for (int j = 0; j < n; j++) {
                if(arr[j] < min && arr[j] > 0){
                    min = arr[j];
                    mindx = j;
                }
            }
            arr[mindx] = -i;
        }
        for(int ele : arr){
            System.out.print(-ele + " ");
        }
    }
}
