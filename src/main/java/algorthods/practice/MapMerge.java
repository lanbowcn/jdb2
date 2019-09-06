package algorthods.practice;


import java.util.*;

/**
 * @Author：lanbow
 * @Date:2019/8/21 15:10
 * @Version 1.0
 */
public class MapMerge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int row = sc.nextInt();
            Map<Integer, Integer> map = new TreeMap<>();
            while (row > 0) {
                int key = sc.nextInt();
                int val = sc.nextInt();
                if (map.containsKey(key)) {
                    map.put(key, val + map.get(key));
                } else {
                    map.put(key, val);
                }
                row--;
            }

//            System.out.println(mapTest);//shuchu {1=2, 2=2}

            //mapTest.keySet();
            Set keys = map.keySet();
            for (Object i : keys) {
                System.out.print(i);
                System.out.print(" ");
                System.out.println(map.get(i));
            }

//entry
            for (Map.Entry i : map.entrySet()) {
                System.out.println(i.getKey() + " " + i.getValue());
            }


//            //mapTest.Entry;  一般
//            Set<Map.Entry<Integer,Integer>> all = mapTest.entrySet();
//            for (Map.Entry i : all) {
//                System.out.println(all.g);
//            }


//            //iter 迭代器 --buhao
//            Iterator iter = mapTest.entrySet().iterator();
//            while(iter.hasNext()){
//                Map.Entry en= (Map.Entry) iter.next();
//                Object key = en.getKey();
//                Object val = en.getValue();
//                System.out.println(key+" "+val);
//            }

        }
    }
}
