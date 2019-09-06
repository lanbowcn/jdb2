package algorthods.practice;

import java.util.Scanner;

/**
 * @Author：lanbow
 * @Date:2019/8/20 21:17
 * @Version 1.0
 */
public class yihuo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int m = sc.nextInt();
        n = n ^ m;

        m = 0;
        while (n != 0) {
            ++m;
            n = n & (n - 1);
        }
        System.out.println(m);


    }
}
