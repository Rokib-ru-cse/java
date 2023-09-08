package array;

import print.PrintList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayToList {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        List<Integer> list1 = Arrays.stream(array1).boxed().collect(Collectors.toList());
        int[] array2 = {1, 2, 3, 4, 5};
        List<Integer> list2 = List.of(Arrays.stream(array2).boxed().toArray(Integer[]::new));
        int[] array3 = {1, 2, 3, 4, 5};
        List<Integer> list3 = IntStream.of(array3).boxed().collect(Collectors.toList());
        PrintList.print(list1);
        PrintList.print(list2);
        PrintList.print(list3);

    }
}
