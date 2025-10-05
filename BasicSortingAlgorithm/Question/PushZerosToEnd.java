package BasicSortingAlgorithm.Question;

public class PushZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int n  = arr.length;

        // // method -1
        // ArrayList<Integer> list = new ArrayList<>();
        // int noz = 0;
        // for(int ele : arr){
        //     if(ele != 0) list.add(ele);
        //     else noz++;
        // }
        
        // for (int i = 1; i <=noz; i++) {
        //     list.add(0);
        // }

        // for (int i = 0; i < n; i++) {
        //     arr[i] = list.get(i);
        // }
       
           
        // Method -2
        int noOfZeros = 0;
        for (int ele : arr) {
            if(ele == 0){
                noOfZeros++;
            }
        }
        for (int i = 0; i < noOfZeros; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j] == 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            
        }
        System.out.println();
        for(int ele : arr){
            System.out.print(ele+" ");
        }
             
    }
}
