package streamapi;

import print.PrintList;

import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 1, 2, 3);
        List<Integer> distinctInt = integers.stream().distinct().toList();
        PrintList.print(distinctInt);
    }
}
