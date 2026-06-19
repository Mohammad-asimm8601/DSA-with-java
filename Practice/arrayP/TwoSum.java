package arrayP;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {3, 5, 5, 7, 8, 4, 3, 0, 8, 4, 30, 65, 9, 1};
        int x = 8;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] + arr[j] == x){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
