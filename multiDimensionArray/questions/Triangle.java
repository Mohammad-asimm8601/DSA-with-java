package multidimensionarray.questions;
import java.util.*;

public class Triangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            List<List<Integer>> triangle = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                List<Integer> l = new ArrayList<>();
                for (int j = 0; j <= i; j++) {
                    l.add(sc.nextInt());
                }
                triangle.add(l);
            }
            System.out.println(triangle);
            int res = minimumTotal(triangle);
            System.out.println(res);
        }   
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
    int n = triangle.size();
    int[] dp = new int[n];

    // Initialize dp with the last row
    for (int i = 0; i < n; i++) {
        dp[i] = triangle.get(n - 1).get(i);
        System.out.print(dp[i]+" ");
    }

    // Bottom-up calculation
    for (int i = n - 2; i >= 0; i--) {
        for (int j = 0; j <= i; j++) {
            dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j + 1]);
            System.out.print(dp[j]+" ");
        }
    }

    return dp[0]; // result is stored at the top
}

}