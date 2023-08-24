package streamapi;

import print.PrintList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(15);
        list.add(25);
        PrintList.print(list);
        List<Integer> even = list.stream().filter(item -> item % 2 == 0).toList();
        PrintList.print(even);
        List<Integer> odd = list.stream().filter(item -> item % 2 == 1).collect(Collectors.toList());
        PrintList.print(odd);

    }
}
