package SwordtoOffer.diffcult;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author：lanbow
 * @Date:2019/9/6 11:08
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] box = new int[n][2];
        for (int i = 0; i < n; i++) {
            box[i][0] = sc.nextInt();
            box[i][1] = sc.nextInt();
        }
        Arrays.sort(box,((o1, o2) -> o1[0]-o2[0]));
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = box[i][1];
        }
        int len =  lis(num,n);//找到最长不减序列
        System.out.println(len);
    }
    private static int lis(int[] arr,int n){
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i]>arr[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        return dp[n-1];
    }
}
