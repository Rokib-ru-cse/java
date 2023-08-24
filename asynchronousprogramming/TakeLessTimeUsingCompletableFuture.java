package asynchronousprogramming;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TakeLessTimeUsingCompletableFuture {
    private static void print(int data) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(data);
    }


    public static void main(String[] args) throws InterruptedException, ExecutionException {
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

        List<CompletableFuture<Void>> completableFutures = new ArrayList<>();
        for (Callable<Void> task : tasks) {
            CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
                try {
                    task.call();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }, executor);
            completableFutures.add(future);
        }


        CompletableFuture<Void> allFutures = CompletableFuture.allOf(
                completableFutures.toArray(new CompletableFuture[0])
        );

        System.out.println(allFutures.isDone());
        System.out.println("xxxxxxxxxxxxxxxxxxx");


        // After some lines of code, wait for all futures to be completed
        allFutures.get(); // This will block until all futures are completed

        // At this point, tasks are submitted and running asynchronously

        // You can choose to interact with futures or perform other operations here

        // Don't forget to eventually shutdown the executor when you're done
        executor.shutdown();


//        You can chain multiple CompletableFuture operations using methods like thenApply, thenAccept, and thenRun.
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 10)
                .thenApplyAsync(result -> result * 2) // Transform the result
                .thenApplyAsync(result -> result + 5);
        int finalResult = future.get();
        System.out.println("finalResult " + finalResult);


//        You can combine results from multiple CompletableFuture instances using methods like thenCombine, thenCompose, and thenCombineAsync.
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 10);
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 5);

        CompletableFuture<Integer> combinedFuture = future1.thenCombine(future2, (result1, result2) -> result1 + result2);
        int combinedResult = combinedFuture.get();
        System.out.println("combinedResult " + combinedResult);


//        you can wait for multiple CompletableFuture instances to complete using methods like allOf and anyOf.
        CompletableFuture<Integer> future11 = CompletableFuture.supplyAsync(() -> 10);
        CompletableFuture<Integer> future22 = CompletableFuture.supplyAsync(() -> 20);

        CompletableFuture<Void> allFutures11 = CompletableFuture.allOf(future11, future22);
        allFutures11.get(); // Wait for all to complete

        CompletableFuture<Object> anyFuture = CompletableFuture.anyOf(future11, future22);
        Object firstCompletedResult = anyFuture.get(); // Get result of the first completed future
        System.out.println("firstCompletedResult " + firstCompletedResult);


//        You can specify asynchronous execution using methods like thenApplyAsync, thenComposeAsync, and thenCombineAsync

        CompletableFuture<Integer> future33 = CompletableFuture.supplyAsync(() -> 10)
                .thenApplyAsync(result -> result * 2);
        int finalResult33 = future33.get();
        System.out.println("finalResult33 " + finalResult33);


        // Iterate through futures to check results and handle exceptions
//        for (int i = 0; i < futures.size(); i++) {
//            Future<Void> future = futures.get(i);
//            if (future.isDone()) {
//                // Task completed
//                try {
//                    //future.get(); // Retrieve result (or handle exception)
//                    System.out.println("Task " + i + " completed successfully.");
//                } catch (Exception e) {
//                    System.err.println("Task " + i + " encountered an exception: " + e.getMessage());
//                }
//            } else {
//                System.out.println("Task " + i + " is still running.");
//            }
//        }


        Instant endInstant = Instant.now();
        Duration duration = Duration.between(startInstant, endInstant);
        long seconds = duration.getSeconds();
        long milliseconds = duration.toMillis();
        System.out.println("Elapsed time in seconds: " + seconds);
        System.out.println("Elapsed time in milliseconds: " + milliseconds);
    }
}
