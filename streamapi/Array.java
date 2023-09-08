package streamapi;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        // count using stream
        int[] arrs = new int[]{1, 2, 3, 4, 5};
        System.out.println(arrs.length);
        long count = Arrays.stream(arrs).count();
        System.out.println(count);

        // iterate using stream
        Arrays.stream(arrs).forEach(System.out::print);



    }
}
