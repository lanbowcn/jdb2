package Test;

import java.text.DecimalFormat;
import java.util.*;

/**
 * @Author：lanbow
 * @Date:2019/8/27 18:15
 * @Version 1.0
 *
 * 6
 * 3 + 2 + 1 + -4 * -5 + 1
 */
public class float_Format {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// 第一种
        DecimalFormat df = new DecimalFormat("#0.00");
        float data;
        data = sc.nextFloat();
        System.out.println(df.format(data));

// 第二种,模仿c语言的输出方式
        System.out.printf("%.2f\n", data);

// 第三种
        System.out.println(String.format("%.2f", data));



    }
}
