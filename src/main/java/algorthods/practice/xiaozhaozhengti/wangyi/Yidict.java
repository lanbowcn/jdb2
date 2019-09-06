package algorthods.practice.xiaozhaozhengti.wangyi;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @Author：lanbow
 * @Date:2019/8/25 12:58
 * @Version 1.0
 */
public class Yidict {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int allway = jiechen(n+m)/(jiechen(n)*jiechen(m));


        boolean[] x = new boolean[m+n];

        for (int i = 0; i < m+n; i++) {
            if (i<n)
                x[i]=true;
            else
                x[i] = false;
        }



        BigDecimal K =new BigDecimal(k);
        for (int i = 0; i < Math.min(n,m); i++) {
            BigDecimal all =new BigDecimal(0);

            while(K.compareTo(all)>0){
                all.add(new BigDecimal(jiechen(i)*jiechen(i)));
            }
        }


        for (int i = 0; i < x.length; i++) {
            if(x[i]==true)
                System.out.print('a');
            else
                System.out.print('z');
        }
    }

    private static int jiechen(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res*=n;
        }
        return res;
    }
}
