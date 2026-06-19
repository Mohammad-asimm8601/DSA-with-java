// Count the number of triplets whose sum is equal to the given value x.
package arrayP;

public class TripletsSum {
    public static void main(String[] args) {
        int[] arr = {1 ,3 ,6, 4 ,7 ,8};
        int x = 11;
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n-2; i++) {
            for (int j=i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    if(arr[i] + arr[j] + arr[k] == x){
                        count++;

                        System.out.println(
                            arr[i]+" "+
                            arr[j]+" "+
                            arr[k]
                        );
                    }
                }
            }
        }
        System.out.println("count = "+ count);
    }
}
