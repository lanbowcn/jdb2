package algorthods.practice.xiaozhaozhengti.wangyi;

import algorthods.utl.Scann;

import java.util.Scanner;

/**
 * @Author：lanbow
 * @Date:2019/8/24 15:01
 * @Version 1.0
 */
public class olock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] clock= new int[n];
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int m = sc.nextInt();
            clock[i]=h*60+m;
        }
        int cost = sc.nextInt();
        int time = 60*sc.nextInt()+sc.nextInt();
        int dadeline = time -cost;

        int mingap = Integer.MAX_VALUE;
        for (int i = 0; i < clock.length; i++) {
            if (clock[i]<=dadeline){
                mingap = Math.min(dadeline-clock[i],mingap);
            }
        }

        System.out.println((dadeline-mingap)/60+" "+(dadeline-mingap)%60);

    }


}
