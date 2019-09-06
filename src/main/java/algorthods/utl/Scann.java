package algorthods.utl;

import java.util.Arrays;
import java.util.Scanner;

public class Scann {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("输入两个树");
//        int a = in.nextInt();
//        int b = in.nextInt();
//        System.out.println("和为"+(a+b));


        //line输入
//        System.out.println("line方式输入");
//        StringTest a = in.nextLine();
//        StringTest b =in.nextLine();
//        System.out.println("结果"+a+"---"+b);


        //数组输入
//        StringTest str = in.nextLine().toString();
//        StringTest[] input = str.split(",");
//        int fin[] = new int[input.length];
//        for (int i = 0; i < input.length; i++) {
//            fin[i] = Integer.parseInt(input[i]);
//            System.out.println("a["+i+"]为"+fin[i]);
//        }

//        //字符数组
//        char[] a = str.toCharArray();
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
        System.out.println("数字个数");
        String nn = in.nextLine();
        int n = Integer.parseInt(nn);

        System.out.println("shuzu");

        String str = in.nextLine().toString();
        String[] input =str.split(" ");
        int val[] = new int[input.length];
        for (int i = 0; i < val.length; i++) {
            val[i] = Integer.parseInt(input[i]);
        }


        int result = find(val);
        System.out.println(result);

    }
    public static int find(int[] val){
        Arrays.sort(val);
        int min = Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for (int i = 0; i < (val.length)/2; i++) {
            int sum = val[i]+val[val.length-1-i];
            min = Math.min(min,sum);
            max = Math.max(max,sum);
            System.out.println(min);
        }

        return max-min;
    }
}
