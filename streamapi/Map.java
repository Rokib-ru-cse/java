package streamapi;

import print.PrintList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(15);
        list.add(25);
        PrintList.print(list);
        List<Integer> doubleValued = list.stream().map(item -> item * item).collect(Collectors.toList());
        PrintList.print(doubleValued);
    }
}
