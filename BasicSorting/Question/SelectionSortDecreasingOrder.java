package BasicSorting.Question;

import java.util.Scanner;

public class SelectionSortDecreasingOrder {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n  = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            for (int i = 0; i < n-1; i++) {
                int max = Integer.MIN_VALUE;
                int maxdx = -1;
                for (int j = i; j < n; j++) {
                    if(arr[j] > max){
                        max = arr[j];
                        maxdx = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[maxdx];
                arr[maxdx] = temp;
            }
            for(int ele : arr){
                System.out.print(ele+" ");
            }
        }
    }
}

