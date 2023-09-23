package concurrent_collections;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapInterface {

    public static void main(String[] args) {
        /*
        * there are 3 extra method in ConcurrentMap
        * putIfAbsent
        * replace
        * remove
        *
        * */
        ConcurrentMap<Integer,Integer> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.putIfAbsent(1,1);
        concurrentMap.putIfAbsent(1,2);
        System.out.println(concurrentMap);


        concurrentMap.replace(1,2,3);
        System.out.println(concurrentMap);

        concurrentMap.replace(1,1,3);
        System.out.println(concurrentMap);

        concurrentMap.remove(1,2);
        System.out.println(concurrentMap);
        concurrentMap.remove(1,3);
        System.out.println(concurrentMap);

    }
}
