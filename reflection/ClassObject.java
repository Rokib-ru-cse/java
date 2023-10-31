package reflection;

import java.util.Arrays;

public class ClassObject {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class<?> testClass1 = Class.forName("reflection.Test");
        Class<?> testClass2 = Test.class;

        Test objectForTestClass1 = (Test) testClass1.newInstance();
        Test objectForTestClass2 = (Test) testClass2.newInstance();

        objectForTestClass1.print("called from objectForTestClass1");
        objectForTestClass2.print("called from objectForTestClass2");

        System.out.println(testClass1.getName());
        System.out.println(testClass1.getSuperclass().getName());
//        System.out.println(testClass1.getTypeName());
        Arrays.stream(testClass1.getInterfaces()).forEach(interfaze -> System.out.println(interfaze.getName()));

    }
}
