// Sort the array of 0's and 1's.
package arrays.questions;
public class SortArray {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1, 1, 1};
        int n = arr.length;
        // int count = 0;
        // for (int i = 0; i < n; i++) {
        //     if(arr[i] == 0) {
        //         count++;
        //     }
        // }
        // for (int i = 0; i < n; i++) {
        //     if(i <  count){
        //         arr[i] = 0;
        //     }
        //     else{
        //         arr[i] = 1;
        //     }
        // }

        // Method 2 -> one pass soln
        int i = 0;
        int j = n-1;
        while(i < j){
            if(arr[i] == 0 ) i++;
            if(arr[j] == 1) j--;
            else if(arr[i] == 1 && arr[j] == 0){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
// it is running  slow since few days, please fix it
