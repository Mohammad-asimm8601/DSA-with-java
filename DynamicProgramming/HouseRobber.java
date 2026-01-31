package DynamicProgramming;

public class HouseRobber {
    public static void main(String[] args) {
        int[] arr = {5, 15, 6, 20, 22, 1};
        int n = arr.length;
        int[] dp = new int[n];
        dp[0] = arr[0]; dp[1] = arr[1];
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(arr[i]+dp[i-2], dp[i-1]);
        }
        System.out.println(dp[n-1]);
    }
}
