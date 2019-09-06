package SwordtoOffer;

import java.util.Scanner;

/**
 * @Author：lanbow
 * @Date:2019/8/27 14:45
 * @Version 1.0
 */
public class NumberOf1 {
    public static int NumberOf1(int n) {
        int res = 0;
        while(n!=0){
            res++;
            n=n&(n-1);
        }
        return res;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            System.out.println(NumberOf1(sc.nextInt()));
        }
    }
}
