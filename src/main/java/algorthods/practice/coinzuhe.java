package algorthods.practice;

/**
 * @Author：lanbow
 * @Date:2019/8/13 22:47
 * @Version 1.0
 * <p>
 * https://blog.csdn.net/qq_42857603/article/details/83411597   硬币选择问题
 */
public class coinzuhe {
    public static int coutall(int[] coins, int n) {
        int[][] dp = new int[coins.length + 1][n + 1];
        for (int i = 0; i < coins.length; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= coins.length; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 0; k <= j / coins[i - 1]; k++) {
                    dp[i][j] = dp[i][j] + dp[i - 1][j - k * coins[i - 1]];
                }
            }
        }
        return dp[coins.length][n];
    }

    public static int countall2(int[] coins, int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j < dp.length; j++) {
                dp[j] = dp[j] + dp[j - coins[i]];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int[] v = {1, 2, 5, 10, 20, 50, 100};
        int n = 8;
        System.out.println(coutall(v, n));
        System.out.println(countall2(v, n));
    }
}
