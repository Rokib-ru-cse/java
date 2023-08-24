package print;

import java.util.List;

public class PrintList {
    public static <T> void println(List<T> list) {
        for (T t : list) {
            System.out.println(t);
        }
    }

    public static <T> void print(List<T> list) {
        for (T t : list) {
            System.out.print(t + " ");
        }
        System.out.println();  
    }
}
