package SwordtoOffer.diffcult;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * @Author：lanbow
 * @Date:2019/9/4 10:30
 * @Version 1.0
 */
//给定数组arr，设长度为n，输出arr的最长递增子序列。（如果有多个答案，请输出其中字典序最小的）
public class LIS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

//len
//        int max = dp1(arr,n);
//        System.out.println(max);
        printLIS(arr,n);
    }
    //动态规划
    private static int dp1(int[] arr, int n) {
        int max = 0;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(dp[i], max);
        }
        return max;
    }
    //贪心
    private static int dp2(int[] arr, int n) {
        int k = 0;
        int[] dp = new int[n];
        dp[k] = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i]>arr[k]){
                dp[++k]=arr[i];
            }else{
                int l =0;
                int r = k;
                int mid = (l+r)>>>1;
                while(l!=r){
                    if (arr[i]>dp[mid]){
                        l=mid+1;
                    }else{
                        r = mid;
                    }
                }
            }
        }
        return k+1;
    }
    private static void printLIS(int[] arr, int n) {
        int[] dp = new int[n];
        int len = 0;
        for (int i = 0; i < n; i++) {
            dp[i]=1;
            for (int j = 0; j < i; j++) {
                if (arr[i]>=arr[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            len = Math.max(dp[i],len);
        }



        Stack<Integer> res = new Stack<>();
        for (int i = n-1; i > 0; i--) {
            if (dp[i]==len&&len>=0){
                res.push(arr[i]);
                len--;
            }
        }
        while(!res.isEmpty()){
            System.out.print(res.pop()+" ");
        }

    }
}
