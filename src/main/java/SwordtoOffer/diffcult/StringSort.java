package SwordtoOffer.diffcult;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @Author：lanbow
 * @Date:2019/9/9 12:40
 * @Version 1.0
 */
public class StringSort {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] x = sc.nextLine().split(",");
//        Arrays.sort(x);
//        for (String i :x){
//            char[] ii = i.toCharArray();
//            Arrays.sort(ii);
//            i = new String(ii);
//        }
//        for (String j :x)
//            System.out.println(j);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            List<Integer> list2 = list;
            list.add(i);
            System.out.println(list2.size());
        }
    }
}
