// WAP to find the largest three elements in the array.
package arrayP;

public class LargestThreeElements {
    public static void main(String[] args) {
        int[] arr = {10, 33, 92, 7, 106, 750, 97, 200};
        int firstLarge = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        int thirdLarge = Integer.MIN_VALUE;
        for(int ele : arr){
            if(ele > firstLarge){
                thirdLarge = secondLarge;
                secondLarge = firstLarge;
                firstLarge = ele;
            }
            else if(ele > secondLarge && ele != firstLarge){
                thirdLarge = secondLarge;
                secondLarge = ele;
            }
            else if (ele > thirdLarge && ele !=secondLarge && ele != firstLarge){
                thirdLarge = ele;
            }
        }
        System.out.println(firstLarge+" "+ secondLarge+" "+thirdLarge);
    }
}
