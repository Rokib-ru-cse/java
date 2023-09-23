package concurrent_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ForkJoinPool;

public class ConcurrentHashMapClass extends Thread {


    @Override
    public void run() {

        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }
        System.out.println("child thread");
        concurrentMap.put(4, 400);
    }

    static ConcurrentMap<Integer, Integer> concurrentMap = new ConcurrentHashMap<>();


    public static void main(String[] args) throws InterruptedException {

        concurrentMap.put(1, 1);
        concurrentMap.put(2, 1);
        concurrentMap.put(3, 1);
        concurrentMap.put(4, 1);
        concurrentMap.put(5, 1);


//        ConcurrentHashMapClass concurrentHashMapClass = new ConcurrentHashMapClass();
//        concurrentHashMapClass.start();

        //if we want to do this using virtual thread
//        Thread thread = Thread.startVirtualThread(()->{
//           try{
//               Thread.sleep(2000);
//           }catch (Exception e){
//
//           }
//            System.out.println("virtual child thread");
//           concurrentMap.put(4,400);
//        });


        // !if we want to do this using virtual thread


        // Create a CompletableFuture for the child task
        CompletableFuture<Void> childTask = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("child thread");
            concurrentMap.put(4, 400);
        });

        // Perform other tasks concurrently if needed...


        for (Map.Entry<Integer, Integer> entry : concurrentMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            Thread.sleep(3000);
        }

        /*
         * with
         * default initial capacity : 16
         * default fillRatio/loadFactor : 0.75
         * default concurrency level : 16
         *
         * */
        ConcurrentMap<Integer, Integer> concurrentMap1 = new ConcurrentHashMap<>();


        /*
         * with
         * default custom initial capacity : 32
         * default fillRatio/loadFactor : 0.75
         * default concurrency level : 16
         *
         * */
        ConcurrentMap<Integer, Integer> concurrentMap2 = new ConcurrentHashMap<>(32);

        /*
         * with
         * default custom initial capacity : 32
         * default custom fillRatio/loadFactor : 0.80
         * default concurrency level : 16
         *
         * */
        ConcurrentMap<Integer, Integer> concurrentMap3 = new ConcurrentHashMap<>(32, 80);


        /*
         * with
         * default custom initial capacity : 32
         * default custom fillRatio/loadFactor : 0.80
         * default custom concurrency level : 32
         *
         * */
        ConcurrentMap<Integer, Integer> concurrentMap4 = new ConcurrentHashMap<>(32, 80, 32);


        /*
         * with
         * default initial capacity : 16
         * default fillRatio/loadFactor : 0.75
         * default concurrency level : 16
         * from another hashmap
         * */
        ConcurrentMap<Integer, Integer> concurrentMap5 = new ConcurrentHashMap<>(new HashMap<>());


    }
}
