package arrays.questions;

public class MultiplyOfArray {
public static void main(String[] args) {
        int[] arr = {12, 32, 3, 4, 5};

        int mul = 1;
        for (int i = 0; i < arr.length; i++) {
            mul *= arr[i];
        }
        System.out.println(mul);
    }
}
