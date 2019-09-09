package Test;

/**
 * @Author：lanbow
 * @Date:2019/9/3 16:54
 * @Version 1.0
 */


import java.util.Scanner;


public class Main2 {
    //矩阵最小路径和
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] x = sc.nextLine().split(" ");
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum+=Integer.parseInt(x[i]);
        }
        long res1 = jiechen(n);
        long res2 = jiechen(sum);
        long res3 = jiechen(n-sum);
        long t = (res1/(res2*res3))%1000000007;
        System.out.println(t);
    }
    private static long jiechen(int a){
        long res = 1;
        for(int i=a;i>0;i--){
            res*=i;
        }
        return res;
    }
}
