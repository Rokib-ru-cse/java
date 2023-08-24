package asynchronousprogramming;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TakeLessTimeOne {
    private static void print(int data) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(data);
    }



    public static void main(String[] args) throws InterruptedException {
        Instant startInstant = Instant.now();
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            final int index = i;
            Callable<Void> c = new Callable<Void>() {
                @Override
                public Void call() throws Exception {
                    print(index);
                    return null;
                }
            };
            Future<Void> future = executor.submit(c);
        }
        executor.shutdown();
        Instant endInstant = Instant.now();
        Duration duration = Duration.between(startInstant, endInstant);
        long seconds = duration.getSeconds();
        long milliseconds = duration.toMillis();
        System.out.println("Elapsed time in seconds: " + seconds);
        System.out.println("Elapsed time in milliseconds: " + milliseconds);
    }
}
