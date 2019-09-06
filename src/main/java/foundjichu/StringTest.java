package foundjichu;

import java.io.UnsupportedEncodingException;

/**
 * @Author：lanbow
 * @Date:2019/8/20 22:56
 * @Version 1.0
 */
public class StringTest {
    public static void main(java.lang.String[] args) {
        System.out.println(Math.pow(2, 3));
        System.out.println(12 >> 2);
        int a = 3;
        System.out.println(Integer.parseInt("21", 16));
        double aaa = (double) (1+3/2);
        System.out.println(aaa);

        java.lang.String s = "ABCabc";
        System.out.println("s = " + s);
        s = "123456";
        System.out.println("s = " + s);

        StringBuilder as = new StringBuilder("");
        as.append(35);
        as.append("asd");
        java.lang.String as2 = "35asd";
        System.out.println(as);


        java.lang.String str = "12345abcde";
        java.lang.String tempStr = "";
        try {
            tempStr = new java.lang.String(str.getBytes("ISO-8859-1"), "GBK");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(tempStr);
        tempStr = tempStr.trim();//使用substring方法截取两端小于空格的字符，并返回一个新String对象
        System.out.println(tempStr);
        
    }
}
