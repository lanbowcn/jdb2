package algorthods.practice.xiaozhaozhengti.kuaishou;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author：lanbow
 * @Date:2019/8/24 17:40
 * @Version 1.0
 */
public class jimu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer,Integer> jimu = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            int v = sc.nextInt();
            if(jimu.containsKey(k)){
                jimu.put(k,Math.min(jimu.get(k),v));
            }else
                jimu.put(k,v);
        }

    }
}
