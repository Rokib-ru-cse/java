package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class AllEnumeration {


    public static void main(String[] args) {
        Vector<Integer> integerList = new Vector<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        Enumeration<Integer> integerEnumeration = integerList.elements();
        while (integerEnumeration.hasMoreElements()) {
            System.out.println(integerEnumeration.nextElement());
        }

        List<Integer> integerList1 = List.of(1, 2, 3, 4, 5);
        Iterator<Integer> integerIterator = integerList1.iterator();
        while (integerIterator.hasNext()){

        }

    }
}
