package algorthods.practice;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * @Author：lanbow
 * @Date:2019/8/21 16:18
 * @Version 1.0
 */
public class floatn {
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
