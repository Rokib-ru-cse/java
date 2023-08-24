package javageneric;

import java.util.ArrayList;
import java.util.List;

public class SumUsingGenerics {

    public static int sum1(List<Integer> list) {
        return list.stream().mapToInt(c -> c).sum();
    }

    public static double sum3(List<? extends Number> list) {
//        return list.stream().mapToDouble(c->c.doubleValue()).sum();
//        list.add(10);
        return list.stream().mapToDouble(Number::doubleValue).sum();
    }

    public static int sum4(List<? super Integer> list) {
//        return list.stream().mapToDouble(c->c.doubleValue()).sum();
//        list.add(10);
        return list.stream().mapToInt(c -> (int) c).sum();
    }

    public static double sum2(List<Double> list) {
        return list.stream().mapToDouble(c -> c).sum();
    }

    /**
     *
     * Covariance - type T and subtypes of T are covariant = <? extends T>  by nature arrays in java are covariant
     * Contravariance - type T and supertypes of T are contravariant = <? super T>
     * Invariance - type T and only type of T is invariant = <T>
     *
     *
     *
     * PECE = producer extends consumer super
     * when we need to return/get list then use <? extends T>
     * when we need to add/put value to list then use <? super T>
     * donot use wild card when we need both get and put
     */

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Double> list2 = List.of(1.1, 2.1, 3.1, 4.1, 5.1);
        List<Number> list3 = List.of(1, 2, 3, 4, 5);
        System.out.println(sum1(list1));
        System.out.println(sum2(list2));
        System.out.println(sum3(list1));
        System.out.println(sum3(list2));
        System.out.println(sum4(list1));
        System.out.println(sum4(list3));
    }
}
