package SwordtoOffer;

import algorthods.utl.Scann;

import java.util.Scanner;

/**
 * @Author：lanbow
 * @Date:2019/8/23 14:52
 * @Version 1.0
 */
public class ReplaceSpace {

    public static String replaceSpace(StringBuffer str){
        String[] in = str.toString().split("");
        String res = "";
        for (String i:in) {
            if (i.equals(" "))
                i="%20";
            res+=i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            StringBuffer x = new StringBuffer(sc.nextLine());
            System.out.println(replaceSpace(x));
        }
    }
}
