package arrayP;

public class DutchFlagAlgo {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2, 1, 2, 0, 0};
        int n = arr.length;
        int lo = 0, mid = 0, hi = n-1;
        while(mid <= hi){
            if(arr[mid] == 0){
                swap(lo, mid, arr);
                lo++; mid++;
            }
            else if(arr[mid] == 1) mid++;
            else{
                swap(hi, mid, arr);
                hi--;
            }
        }
        for(int ele : arr){
        System.out.print(ele+" ");
    }
        
    }

    private static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
