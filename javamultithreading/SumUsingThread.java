package javamultithreading;

import java.time.Duration;
import java.time.Instant;

public class SumUsingThread extends Thread {
    private int start;
    private int end;
    private int partialSum;

    public SumUsingThread(int start, int end) {
        this.start = start;
        this.end = end;
        this.partialSum = 0;
    }

    public int getPartialSum() {
        return partialSum;
    }

    @Override
    public void run() {
        for (int num = start; num <= end; num++) {
            partialSum += num;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Instant startInstant = Instant.now();
        long startTimeNano = System.nanoTime();
        int totalNumbers = 100;
        int numberOfThreads = 10;

        SumUsingThread[] threads = new SumUsingThread[numberOfThreads];
        int numbersPerThread = totalNumbers / numberOfThreads;

        for (int i = 0; i < numberOfThreads; i++) {
            int start = i * numbersPerThread + 1;
            int end = (i == numberOfThreads - 1) ? totalNumbers : (i + 1) * numbersPerThread;

            threads[i] = new SumUsingThread(start, end);
            threads[i].start();
        }

        int finalSum = 0;
        for (SumUsingThread thread : threads) {
            thread.join();
            finalSum += thread.getPartialSum();
        }

        System.out.println("Final sum: " + finalSum);

        Instant endInstant = Instant.now();
        Duration duration = Duration.between(startInstant, endInstant);

        long seconds = duration.getSeconds();
        long milliseconds = duration.toMillis();
        long endTimeNano = System.nanoTime();
        long elapsedTimeNano = endTimeNano - startTimeNano;

        System.out.println("Elapsed time in seconds: " + seconds);
        System.out.println("Elapsed time in milliseconds: " + milliseconds);

        System.out.println("Elapsed time in nanoseconds 10^6 milli and 10^9 sec: " + elapsedTimeNano);
    }
}
