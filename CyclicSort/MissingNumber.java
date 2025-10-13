// Find the missing number from 0 to n
package CyclicSort;

public class MissingNumber {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr  = { 0,1};
        int res = missingNum(arr);
        System.out.println(res);

    }
    public static int missingNum(int[] arr){
        int n  = arr.length;
        int i = 0;
        while(i < n){
            if (arr[i] != i &&  arr[i] != n ){
                swap(arr, i, arr[i]);
            } 
            else  i++;
        }
        System.out.println();
        for ( i = 0; i < n; i++) {
            if(arr[i] != i){
                return i;
            }   
        }
        return i;
    }
}


