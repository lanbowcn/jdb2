package SwordtoOffer.diffcult;

import algorthods.utl.Scann;

import java.util.Scanner;

/**
 * @Author：lanbow
 * @Date:2019/9/2 15:23
 * @Version 1.0
 */
public class MaxSum_k {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int[] array = new int[n + 1];
        for (int i = 1; i <= n; i++)
            array[i] = scanner.nextInt();

        int res = 0;
        int[] dp = new int[n + 1];
        int[] maxArray = new int[n + 1];
        for (int i = 1; i <= m; i++) {
            res = Integer.MIN_VALUE;
            for (int j = i; j <= n; j++) {
                dp[j] = Math.max(dp[j - 1], maxArray[j - 1]) + array[j];
                maxArray[j-1] = res;
                res = Math.max(dp[j],res);
            }
        }

        System.out.println(res);
    }





}
