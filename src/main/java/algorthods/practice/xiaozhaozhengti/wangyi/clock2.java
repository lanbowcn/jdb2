package algorthods.practice.xiaozhaozhengti.wangyi;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @Author：lanbow
 * @Date:2019/8/24 15:32
 * @Version 1.0
 */
public class clock2 {
    public static class Time implements Comparable<Time> {
        int h;
        int m;

        public Time(int h, int m) {
            this.h = h;
            this.m = m;
        }

        @Override
        public int compareTo(Time o) {
            if (o.h == this.h) {
                return this.m <= o.m ? -1 : 1;
            } else
                return this.m < o.m ? -1 : 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> clk = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int m = sc.nextInt();
            clk.add(new Time(h,m));
        }
        int cost = sc.nextInt();
        Time last = new Time(sc.nextInt(),sc.nextInt());
        if (last.m<cost){
            last.h -=cost/60;
            last.m +=60-cost%60;
        }else
            last.m-=cost;
        Collections.sort(clk);
        int resindex = 0;
        for(Time t:clk){
            if (t.compareTo(last)==1){
                resindex=clk.indexOf(t)-1;
            }
        }
        System.out.println(clk.get(resindex).h+" "+clk.get(resindex).m);
    }




}
