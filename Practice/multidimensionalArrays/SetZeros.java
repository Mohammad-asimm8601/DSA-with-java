package multidimensionalArrays;

public class SetZeros {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1},
        };
        int m = arr.length;
        int n = arr[0].length;
        
        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] == 0){
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(rows[i] || cols[j]){
                    arr[i][j] = 0;
                }
            }
        }

        for(int[] row : arr){
            for(int ele : row){
                System.out.print(ele+" ");
            }
            System.out.println();
        }



    }

}
