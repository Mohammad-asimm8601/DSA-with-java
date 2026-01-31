package DynamicProgramming;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 8;
        int[] dp = new int[n+1];
        dp[0] = 0; dp[1] = 1;
        for (int i = 2; i < n+1; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        for (int ele : dp) {
            System.out.print(ele+" ");
        }
    }
}
