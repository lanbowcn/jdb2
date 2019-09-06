package algorthods.practice;

import java.util.Scanner;

/**
 * @Author：lanbow
 * @Date:2019/8/20 21:57
 * @Version 1.0
 */
public class huiwenshu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long aa = 12470382813318369L;
        System.out.println(recsum(a));
        System.out.println(recsum2(a));
    }

    private static long recsum(int a) {
        String[] res = new String[a];
        long sum = 0;
        for (int i = 1; i <= a; i++) {
            res[i - 1] = "";
            for (int j = 1; j <= i; j++) {
//                res[i]+=StringTest.valueOf(j);
                res[i - 1] += j;
            }
            for (int j = i - 1; j > 0; j--) {
                res[i - 1] += j;
            }
            System.out.println(res[i - 1]);
            sum += Long.parseLong(res[i - 1]);
        }

        return sum;
    }

    private static long recsum2(int a) {
        long[] res = {1L, 121L, 12321L, 1234321L, 123454321L, 12345654321L, 1234567654321L, 123456787654321L};
        long ret = 0;
        for (int i = 0; i < a; i++) {
            ret += res[i];
        }

        return ret;
    }
}
