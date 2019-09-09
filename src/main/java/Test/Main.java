package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


/**
 * @Author：lanbow
 * @Date:2019/9/6 18:52
 * @Version 1.0
 */


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n = sc.nextLine().split(" ");
        int[] h = new int[n.length];
        for (int i = 0; i < n.length -1; i++) {
            h[i] = Integer.parseInt(n[i]);
        }
        int temp = Integer.parseInt(n[n.length -1]);
        Arrays.sort(h);
        if (temp<h[0])
            System.out.println(-1);
        int index =0;
        for (int i = 0; i < h.length; i++) {
            if (h[i]==temp)
                System.out.println(1);
            else if(h[i]==temp)
                index = Math.max(index,i);
        }


    }
}

