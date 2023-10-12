package java8.lambda;

public class LambdaExample {

    public static void main(String[] args) {
        Test1 test1 = () -> System.out.println(3 + 4);
        test1.sum();

        Test2 test2 = (a, b) -> System.out.println(a + b);
        test2.sum(2, 3);

        Test3 test3 = (string) -> string.length();
        System.out.println(test3.getLength("test"));
    }
}

@FunctionalInterface
interface Test1 {
    void sum();
}

@FunctionalInterface
interface Test2 {
    void sum(int a, int b);
}

@FunctionalInterface
interface Test3 {
    int getLength(String string);
}