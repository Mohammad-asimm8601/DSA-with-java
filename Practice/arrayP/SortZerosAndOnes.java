package arrayP;

public class SortZerosAndOnes {

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 1, 1, 0, 0, 1, 0};
        int n = arr.length;
        int i=0, j=n-1;
        while(i<j){
            while( i<j && arr[i] == 0) i++;
            while(i<j && arr[j] == 1) j--;


            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
