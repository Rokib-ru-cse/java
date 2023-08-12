package annotation;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@ClassAnnotation
public class Main {

    @SuppressWarnings("unused")
    @FieldAnnotation
    TestClass testClass = new TestClass();

    @MethodAnnotation(times = 3)

    public void test() {
        System.out.println("test is called");
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        @SuppressWarnings("unused")
        String s = "";
        Main main = new Main();
        for (Method method : Main.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(MethodAnnotation.class)) {

                MethodAnnotation annotation = method.getAnnotation(MethodAnnotation.class);
                for (int i = 0; i < annotation.times(); i++) {
                    method.invoke(main);
                }

            }
        }
//        TestClass testClass1
        for (Field field : Main.class.getDeclaredFields()) {
            if (field.isAnnotationPresent(FieldAnnotation.class)) {
                System.out.println(field.get(new Main()));
                System.out.println(field.get(new Main()).getClass());
                System.out.println(field.get(new Main()).getClass().getName());
            }
        }

        System.out.println(Main.class.isAnnotationPresent(ClassAnnotation.class));
    }
}
