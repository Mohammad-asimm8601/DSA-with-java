package BasicSorting.Question;

public class KthMaximumAtRightPosition {
    public static void main(String[] args) {
        int[] arr = {6, 64, 25, 12, 22, 11, 90};
        int n  = arr.length;
        for (int i = 0; i < n; i++) {
            int maxdx = 0;
            for (int j = 1; j < n-i; j++) {
                if(arr[j] > arr[maxdx]){
                    maxdx = j;
                }
            }
            int temp = arr[maxdx];
            arr[maxdx] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
