package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOf {

    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);

        String[] stringArray = {"apple", "banana", "cherry"};
        List<String> stringList = Arrays.asList(stringArray);
        Stream<String> stringStream = stringList.stream();

    }
}
