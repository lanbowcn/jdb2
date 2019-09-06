package SwordtoOffer.diffcult;

import java.util.Scanner;

/**
 * @Author：lanbow
 * @Date:2019/9/6 9:45
 * @Version 1.0
 */
public class Coin_Combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] coin = new int[n];
        for (int i = 0; i < n; i++) {
            coin[i] = sc.nextInt();
        }

        int[] dp = new int[m+1];
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = coin[i]; j < m+1; j++) {
                dp[j] = (dp[j]+dp[j-coin[i]])%100000007;
            }
        }
        System.out.println(dp[m]);
    }
}
