// Find the unique number in a given Array where all the elements are being repeated twice with one value
// being unique.
package arrayP;

public class UniqueELements {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, -1, -1,4, 5, 5, 7, 9, 7, 9};

        // Method-1
        
        // int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        // for(int num : arr){
        //     min = Math.min(min, num);
        //     max = Math.max(max, num);
        // }

        // int[] freq = new int[max - min + 1];
        // for(int num : arr){
        //     int index = num-min;
        //     freq[index]++;
        // } 
        // for (int i = 0; i < freq.length; i++) {
        //     if(freq[i] == 1) System.out.println(i + min);
        // }

        // Method-2
        int unique = 0;
        for(int num : arr){
            unique ^= num;
        }
        System.out.println(unique);
    }
}
