package utils;

import java.time.Duration;
import java.time.Instant;

public class Time {
    public static void main(String[] args) {

//        approach 1

        long startTimeMillis = System.currentTimeMillis();
        long endTimeMillis = System.currentTimeMillis();
        long elapsedTimeMillis = endTimeMillis - startTimeMillis;

        System.out.println("Elapsed time in milliseconds: " + elapsedTimeMillis);


//        approach 2

        Instant startInstant = Instant.now();
        Instant endInstant = Instant.now();
        Duration duration = Duration.between(startInstant, endInstant);
        long seconds = duration.getSeconds();
        long milliseconds = duration.toMillis();
        System.out.println("Elapsed time in seconds: " + seconds);
        System.out.println("Elapsed time in milliseconds: " + milliseconds);


//        approach 3

        long startTimeNano = System.nanoTime();

        long endTimeNano = System.nanoTime();
        long elapsedTimeNano = endTimeNano - startTimeNano;
        System.out.println("Elapsed time in nanoseconds 10^6 milli and 10^9 sec: " + elapsedTimeNano);
    }
}
