package BasicSortingAlgorithm;

import java.util.Scanner;

public class BubbleSortAlgorithm {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Bubble sort Optimised
            for (int j = 0; j < n - 1; j++) {
                boolean flag = true;
                for (int i = 0; i < n - 1 - j; i++) {
                    if (arr[i] > arr[i + 1] ) {
                        swap(arr, i, i+1);
                        flag = false;

                    }
                }
                if (flag == true) break;
            }
            print(arr);
        }
    }
}
