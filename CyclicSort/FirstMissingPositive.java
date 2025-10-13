package CyclicSort;

public class FirstMissingPositive {
    public static void  swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1};
        int res = firstMissingPositive(arr);
        System.out.println(res);
    }
    public static int firstMissingPositive(int[] arr){
        int n = arr.length;

        // Method -1

        // Set<Integer> set = new HashSet<>();
        // for (int  elem : arr) {
         //     set.add(elem);
        // }
        // for (int i = 1; i <= n; i++) {
        //     if(!set.contains(i)) return i;
        // }
        // return 45349;

        // Method 2

        int i=0;
        while(i < n){
            int ele = arr[i];
            if(ele <= 0 || ele == i+1 || ele>n || ele == arr[ele-1]) i++;
            else swap(arr, i, ele-1);
        }
        for ( i = 0; i < n; i++) {
            if(arr[i] != i+1) return i+1;
        }
        return i+1;
    }
}
