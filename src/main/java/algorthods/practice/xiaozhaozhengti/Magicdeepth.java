package algorthods.practice.xiaozhaozhengti;

import java.util.Scanner;

/**
 * @Author：lanbow
 * @Date:2019/8/25 14:31
 * @Version 1.0
 */
public class Magicdeepth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] step = new int[1001];


        step[0]=1;
        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j < i+1; j=j*2) {
                step[i]+=step[i-j];
                step[i] %= 1000000003;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(step[sc.nextInt()]);
        }
    }




}
