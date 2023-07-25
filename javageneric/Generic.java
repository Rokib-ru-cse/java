package javageneric;

import java.util.ArrayList;
import java.util.List;

public class Generic {

    public static void main(String[] args) {
        Generic t = new Generic();

        PairTest<Integer> pairTest1 = t.new PairTest<Integer>();
        pairTest1.first = 1;
        pairTest1.second = 2;
        System.out.println(pairTest1.first);
        System.out.println(pairTest1.second);

        PairTest<String> pairTest2 = t.new PairTest<>();
        pairTest2.first = "abc";
        pairTest2.second = "xyz";
        System.out.println(pairTest2.first);
        System.out.println(pairTest2.second);
    }

    class PairTest<T> {
        T first;   // T = int,string, boolean, double, any type
        T second;
    }

}
