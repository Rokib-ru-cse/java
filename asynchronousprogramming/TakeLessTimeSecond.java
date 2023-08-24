package asynchronousprogramming;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TakeLessTimeSecond {
    private static void print(int data) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(data);
    }


    public static void main(String[] args) throws InterruptedException {
        Instant startInstant = Instant.now();


        ExecutorService executor = Executors.newFixedThreadPool(10);
        List<Callable<Void>> tasks = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            Callable<Void> c = new Callable<Void>() {
                @Override
                public Void call() throws Exception {
                    print(index);
                    return null;
                }
            };
            tasks.add(c);
        }

        List<Future<Void>> futures = executor.invokeAll(tasks); // execution wait here until completion, invokeall wait
        System.out.println("xxxxxxxxxxxxxxxxxxx");
        // executor.shutdown();
//        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);



        // Iterate through futures to check results and handle exceptions
        for (int i = 0; i < futures.size(); i++) {
            Future<Void> future = futures.get(i);
            if (future.isDone()) {
                // Task completed
                try {
                    //future.get(); // Retrieve result (or handle exception)
                    System.out.println("Task " + i + " completed successfully.");
                } catch (Exception e) {
                    System.err.println("Task " + i + " encountered an exception: " + e.getMessage());
                }
            } else {
                System.out.println("Task " + i + " is still running.");
            }
        }








        Instant endInstant = Instant.now();
        Duration duration = Duration.between(startInstant, endInstant);
        long seconds = duration.getSeconds();
        long milliseconds = duration.toMillis();
        System.out.println("Elapsed time in seconds: " + seconds);
        System.out.println("Elapsed time in milliseconds: " + milliseconds);
    }
}
