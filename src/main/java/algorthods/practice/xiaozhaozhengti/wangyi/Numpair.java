package algorthods.practice.xiaozhaozhengti.wangyi;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @Author：lanbow
 * @Date:2019/8/24 13:32
 * @Version 1.0
 */
public class Numpair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long k = sc.nextInt();


        BigDecimal res = new BigDecimal((n - k + 1) * (n - k) / 2);

        for (int i = 1; k + i <= n; i++) {
            BigDecimal t =new  BigDecimal(((n -k-i)/ (k + i))*i);
            //System.out.println("---" + t);
            BigDecimal last = new BigDecimal(n % (k + i) >= k ? n % (k + i) - k + 1 : 0);
            //System.out.println("---" + last);
            BigDecimal num = t.add(last);
            res = res.add(num);
        }
        if (k==0)
            System.out.println(res.subtract(new BigDecimal(n)));
        else
            System.out.println(res);
    }

}
