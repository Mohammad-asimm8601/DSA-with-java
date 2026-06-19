// Find the difference between the sum of elements at even indices to the sum of elements at odd indices.
package arrayP;

public class DifferenceSumOfEvenOddELements {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int even = 0, odd = 0;
        for(int num : arr){
            if((num & 1) == 0) even += num;
            else odd += num;
        }
        System.out.println(Math.abs(even-odd));
    }
}
