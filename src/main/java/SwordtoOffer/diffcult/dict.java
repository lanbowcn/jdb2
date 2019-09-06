package SwordtoOffer.diffcult;

import java.util.*;

/**
 * @Author：lanbow
 * @Date:2019/9/2 14:54
 * @Version 1.0
 */
public class dict {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] x = sc.nextLine().toCharArray();
        TreeMap<Character,Integer> chmap=new TreeMap<>();
        for (int i = 0; i < x.length; i++) {
            if (chmap.containsKey(x[i]))
                chmap.put(x[i],chmap.get(x[i])+1);
            else
                chmap.put(x[i],1);
        }
        String res = "";
        for (Map.Entry<Character,Integer> c :chmap.entrySet()){
            res=res+c.getKey()+c.getValue();
        }
        System.out.println(res);
    }
}
