// Find the second largest element in the given Array in one pass
package arrayP;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 33, 92, 7, 106, 750, 97, 2000};
        int FirstLarge = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        for (int num : arr) {
            if(num > FirstLarge){
                secondLarge = FirstLarge;
                FirstLarge = num;
            }
            else if(secondLarge < num && FirstLarge != num){
                secondLarge = num;
            }
        }
        System.out.println(secondLarge);
    }
}
