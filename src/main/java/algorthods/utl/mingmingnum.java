package algorthods.utl;

import java.util.*;

/**
 * @Author：lanbow
 * @Date:2019/8/21 11:26
 * @Version 1.0
 */
public class mingmingnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int len = sc.nextInt();
            //hashset
//            HashSet<Integer> a = new HashSet<>();
//            while(len>0){
//                a.add(sc.nextInt());
//            }
            //shuzu
            int[] num = new int[len];
            HashSet<Integer> dict = new HashSet<>();
            int i = 0;
            while (len-- > 0){
                int val = sc.nextInt();
                if (!dict.contains(val)) {
                    dict.add(val);
                    num[i++] = val;

                }
            }
            //剪切
//            int[] res = Arrays.copyOfRange(num, 0, dict.size());
//            Arrays.sort(res);
//            for (int xi : res) {
//                System.out.println(xi);
//            }

            //hash
            for(int x :dict)
                System.out.println(x);
        }
//        //打印
//        Arrays.sort(num, 0, dict.size());
//        for (int j = 0; j < dict.size(); j++) {
//            System.out.println(num[i]);
//        }


    }
}

