package DynamicProgramming;

public class MinCost {
    public static void main(String[] args) {
        int[] cost = { 1, 4, 100, 3, 3, 50, 6 };
        int n = cost.length;
        int[] dp = new int[n];
        dp[0] = cost[0]; dp[1] = cost[1];
        for (int i = 2; i < n; i++) {
            dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
        }
        System.out.println(dp[n-1]);
    }
}
