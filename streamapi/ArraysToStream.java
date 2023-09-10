package streamapi;

import serialization.Dog;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraysToStream {
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(System.out::print);
        System.out.println();
        double[] doubleArray = new double[]{1, 2, 3, 4, 5};
        DoubleStream doubleStream = Arrays.stream(doubleArray);
        doubleStream.forEach(System.out::print);

        System.out.println();
        String[] stringArray = new String[]{"A", "B", "C", "D", "E"};
        Stream<String> stringStream = Arrays.stream(stringArray);
        stringStream.forEach(System.out::print);
        System.out.println();

        Stream.Builder<String> builder = Stream.builder();
        builder.add("apple").add("banana").add("cherry");
        Stream<String> stringStream1 = builder.build();
        stringStream1.forEach(System.out::print);
        System.out.println();
    }
}
