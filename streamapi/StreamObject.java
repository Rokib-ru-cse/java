package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class StreamObject{



    public static void main(String[] args) {
        
        Stream<Object> obj1 = Stream.empty();
        String names[] = {"a","c","d","d","ee"};
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(System.out::println);
        System.out.println(obj1);

        Stream s = (Stream)Arrays.stream(new int[]{1,2,3,4});
    
    }

}
