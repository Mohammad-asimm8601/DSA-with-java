package arrayP;
import java.util.Arrays;

public class SortArray {

     public static void main(String[] args) {
        int[] arr = {2, 2, 2, 1, 1, 1, 2, 2};
        int n = arr.length;

        // brute force --> using freq element
        for(int val : arr){
            int freq = 0;
            for(int num : arr){
                if(val == num){
                    freq++;
                }
            }
            if(freq > n/2){
                System.out.println("Brute force : " +val);
                break;
            }
        }


        // Optimize --> using  sorting
        Arrays.sort(arr);
        System.out.println("Optimize :"+arr[n/2]);

        // Moore's Voting algorithm
        int freq = 0, ans = 0;
        for (int i = 0; i < n; i++) {
            if(freq == 0) ans = arr[i];
            if(ans == arr[i]) freq++;
            else freq--;
        }

        System.out.println("using moore's voting algo : "+ans);
    }

    
    

}
