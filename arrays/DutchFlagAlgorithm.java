// Sort array of 0's, 1's and 2's. (Dutch flag Algorithm)
package arrays;
public class DutchFlagAlgorithm {
    public static void main(String[] args) {
        int[] arr = {0, 2,  0, 2, 1};
        int len = arr.length;

        // Method-1
        // int countZero = 0, countOne = 0;
        // for (int i = 0; i < len; i++) {
        //     if(arr[i] == 0) countZero++;
        //     if(arr[i] == 1)countOne++;
        // }
        // for (int i = 0; i < len; i++) {
        //     if(i < countZero) arr[i] = 0;
        //     else if (i < countOne+countZero) arr[i] = 1;
        //     else arr[i] = 2;
        // }
        
        /* Method-2 (Dutch Flag  Algorithm)
            
            
        */
        int low = 0, mid = 0, hi = len-1;
        while(mid <= hi){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1) mid++;
            else {  // arr[mid] == 2;
                 int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                hi--;
            }
        } 
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
           