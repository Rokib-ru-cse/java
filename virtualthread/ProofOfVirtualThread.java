package virtualthread;

import java.util.List;
import java.util.stream.IntStream;

public class ProofOfVirtualThread {
    public static void main(String[] args) throws InterruptedException {
//        List<Thread> threads = IntStream.range(0, 10).mapToObj(value -> Thread.ofVirtual().unstarted(() -> {
//            if (value == 0) {
//                System.out.println(Thread.currentThread());
//            }
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            if (value == 0) {
//                System.out.println(Thread.currentThread());
//            }
//        })).toList();
//        threads.forEach(Thread::start);
//        for (Thread thread:threads) {
//            thread.join();
//        }
    }
}
