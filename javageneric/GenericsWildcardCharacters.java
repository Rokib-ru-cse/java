package javageneric;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class GenericsWildcardCharacters {


    /**
     * If T is a class, then ? super T refers to any class that is higher in the inheritance hierarchy than T.
     * If T is an interface, then ? super T refers to any class that implements T, or any class higher in the inheritance hierarchy.
     * <p>
     * Object-> Thread
     * Runnable->Thread
     * then we can call by Thread class or object class or runnable interface
     */

    private static void print1(List<?> list) {
        list.add(null); // null is valid value from any type
        for (Object t : list) {
            System.out.print(t + " ");
        }
        System.out.println();
    }


    private static void print2(List<String> list) {
        list.add("sss");
        for (String str : list) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    private static void print3(List<? extends Object> list) {

        list.add(null);  // null is valid value from any type , this types of method are only suitable for readonly operation
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    private static void print4(List<? super String> list) {
        for (Object str : list) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    private static void print5(List<? super Thread> list) {
        for (Object t : list) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    private static void print6(List<? super DD> any) {
        System.out.println(any);
    }

    private static void print7(List<? super Runnable> any) {
        System.out.println(any);
    }

    private static void print8(List<? super Object> any) {
        System.out.println(any);
    }

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("ss");
        stringList.add("abc");
        stringList.add("edg");
        print1(stringList);
        print2(stringList);
        print3(stringList);
        print4(stringList);

        List<Thread> threadList1 = new ArrayList<>();
        threadList1.add(new Thread());
        List<Runnable> threadList2 = new ArrayList<>();
        threadList2.add(() -> System.out.println("hi"));
        List<Object> threadList3 = new ArrayList<>();
        threadList3.add("eee");

        print5(threadList1);
        print5(threadList2);
        print5(threadList3);

        print6(new ArrayList<A>());
//        print6(new ArrayList<CA>());
        print6(new ArrayList<BA>());
        print6(new ArrayList<CB>());
        print6(new ArrayList<D>());
        print6(new ArrayList<DD>());
        print6(new ArrayList<Object>());

        // Case 1: List<Object> is a superclass of Runnable
        List<Object> list1 = new ArrayList<>();
        print7(list1);

        // Case 2: List<Thread> is a superclass of Runnable
        List<Thread> list2 = new ArrayList<>();
//        print7(list2);

        // Case 3: List<Runnable> is the exact type
        List<Runnable> list3 = new ArrayList<>();
        print7(list3);

        // Case 4: List<Callable<?>> is a superclass of Runnable
        List<Callable<?>> list4 = new ArrayList<>();
//        print7(list4);

        List<String> stringList1 = new ArrayList<>();
        stringList1.add("s");
//        print8(stringList1);


    }
}

interface A {
    void print();
}

class AA implements A {
    public void print() {
    }
}

interface BA extends A {
    void print();
}

interface CA extends A {
    void print();
}

interface CB extends BA {
    void print();
}

interface D extends CB {
    void print();
}

class DD implements D {
    public void print() {
    }
}

