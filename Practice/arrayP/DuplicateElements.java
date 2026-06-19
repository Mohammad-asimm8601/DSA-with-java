// WAP to find the duplicate elements from the given array of elements
package arrayP;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1, 3,  4, 6, 3,2, 2, -14 };
        int min = arr[0];
        int max = arr[0];
        for(int num : arr){
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        int[] freq = new int[max - min + 1];
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            int index = ele - min;

            freq[index]++;

            if(freq[index] > 1){
                System.out.println("Duplicate : "+ ele);
            }
        }
    }
}
