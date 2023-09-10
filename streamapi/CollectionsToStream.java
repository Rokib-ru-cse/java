package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionsToStream {

    public static void main(String[] args) {
        String[] stringArray = {"apple", "banana", "cherry"};
        List<String> stringList = Arrays.asList(stringArray);
        Stream<String> stringStream = stringList.stream();

    }
}
