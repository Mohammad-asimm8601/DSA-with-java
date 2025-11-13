package advanceSorting;

public class KthLargestElement {
    static int ans;
    public static void  print(int[] arr){
        for(int ele : arr){
            System.out.print(ele +" ");
        }
        System.out.println();
    } 
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr, int lo, int hi){
        int pivot = arr[lo], pivotIdx = lo;
        int smallerCount = 0;
        for (int i = lo+1; i <= hi; i++) {
            if(arr[i] < pivot) smallerCount++;
        }
        int corretIdx = pivotIdx + smallerCount;
        swap(arr, pivotIdx, corretIdx);
        int i=lo, j=hi;
        while(i < corretIdx && j > corretIdx){
            if(arr[i] <= pivot) i++;
            else if(arr[j] > pivot) j--;
            else if(arr[i] > pivot && arr[j] <= pivot){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return corretIdx;
    }
    public static void quickSelect(int[] arr, int lo, int hi, int k){
        if(lo > hi) return;
        if(lo == hi){
            if(lo == k-1) ans = arr[lo];
        }
        int idx = partition(arr, lo, hi);
        if(idx == k-1){
            ans = arr[idx];
            return;
        }
        if(k-1 < idx){
            quickSelect(arr, lo, idx-1,k);   
        }
        else quickSelect(arr, idx+1, hi, k);
    }

    public static void main(String[] args) {
        int[] arr = {4, 9, 1, 2, 6, 5, 8};
        int k  = 2;
        int n = arr.length;
        print(arr);
        ans = -1;
        quickSelect(arr, 0, n-1, n-k+1);
        System.out.println(ans);
    }
}
