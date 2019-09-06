package algorthods.practice.xiaozhaozhengti.kuaishou;

import java.util.Scanner;

/**
 * @Author：lanbow
 * @Date:2019/8/24 17:18
 * @Version 1.0
 */
public class splitMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] m = new long[n];
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }

        int left = -1;
        int right = n;
        long leftsum = 0;
        long rightsum = 0;
        long res = 0;
        while(left!=right){
            if(leftsum>=rightsum){
                rightsum+=m[--right];
            }else{
                leftsum+=m[++left];
            }
            if(leftsum==rightsum)
                res = leftsum;
        }
        System.out.println(res);
    }
}
