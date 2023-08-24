package javamultithreading;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class SumWithAsynchronous {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Instant startInstant = Instant.now();
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
                sum += i;
            }
            return sum;
        });

        int finalSum = future.get();

        System.out.println("Final sum: " + finalSum);

        Instant endInstant = Instant.now();
        Duration duration = Duration.between(startInstant, endInstant);

        long seconds = duration.getSeconds();
        long milliseconds = duration.toMillis();
        System.out.println("Elapsed time in seconds: " + seconds);
        System.out.println("Elapsed time in milliseconds: " + milliseconds);
    }
}
