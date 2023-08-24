package collections;

import java.util.Arrays;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        int[] array1 = list1.stream().mapToInt(Integer::intValue).toArray();
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        int[] array2 = new int[list2.size()];
        for (int i = 0; i < list2.size(); i++) {
            array2[i] = list2.get(i);
        }

    }
}
