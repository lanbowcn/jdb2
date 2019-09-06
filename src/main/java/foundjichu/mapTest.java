package foundjichu;

import javax.management.Query;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;


/**
 * @Author：lanbow
 * @Date:2019/8/27 22:12
 * @Version 1.0
 */
class mapTest {
    public static void main(java.lang.String[] args) {
            HashMap<Integer,Integer> map1 = new HashMap<>();
            HashSet<Integer> set1 = new HashSet<>();
            Hashtable<Integer,Integer>  table1= new Hashtable<Integer,Integer>();
            ConcurrentHashMap x = new ConcurrentHashMap();

            map1.put(null,1);
            set1.add(null);
            table1.put(1,1);

        AtomicInteger x23 = new AtomicInteger(0);
    }
}
