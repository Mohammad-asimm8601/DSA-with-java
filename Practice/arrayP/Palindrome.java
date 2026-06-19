// If an array arr contains n elements, then check if the given array is a palindrome or not .
package arrayP;

public class Palindrome {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 3, 2, 1 };
        int n = arr.length;
        int i=0, j=n-1;
        boolean flag = true;
        while(i < j){
            if(arr[i] != arr[j]){
                flag = false;
                break;
            }
            i++;
            j--;   
        }
        if(flag == true)System.out.println("Palindrome");
        else System.out.println("Not Palindrome!");
    }
}
