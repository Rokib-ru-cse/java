package javamultithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SumUsingExecutorService {

    public static void main(String[] args) {
        long startTimeMillis = System.currentTimeMillis();
        int totalNumbers = 100;
        int numberOfThreads = 10;

        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);
        List<Future<Integer>> futures = new ArrayList<>();

        int numbersPerThread = totalNumbers / numberOfThreads;

        for (int i = 0; i < numberOfThreads; i++) {
            final int start = i * numbersPerThread + 1;
            final int end = (i == numberOfThreads - 1) ? totalNumbers : (i + 1) * numbersPerThread;

            Callable<Integer> task = () -> {
                int sum = 0;
                for (int num = start; num <= end; num++) {
                    sum += num;
                }
                return sum;
            };

            futures.add(executor.submit(task));
        }

        int finalSum = 0;
        for (Future<Integer> future : futures) {
            try {
                finalSum += future.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();

        System.out.println("Final sum: " + finalSum);
        long endTimeMillis = System.currentTimeMillis();
        long elapsedTimeMillis = endTimeMillis - startTimeMillis;

        System.out.println("Elapsed time in milliseconds: " + elapsedTimeMillis);
    }


}
