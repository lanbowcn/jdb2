package SwordtoOffer.diffcult;

import java.util.Scanner;

/**
 * @Author：lanbow
 * @Date:2019/9/4 16:43
 * @Version 1.0
 */
//最大子段和
public class LSS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] dp = new int[n];
        dp[0] = arr[0];
        int max = 0;
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i-1],0)+arr[i];
            max = Math.max(dp[i],max);
        }
        System.out.println(max);

    }
}
