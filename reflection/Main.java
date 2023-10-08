package reflection;

import java.lang.reflect.Field;

public class Main {
    private int data = 10;
}

class Reflection {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Main main = new Main();
        Field field = main.getClass().getDeclaredField("data");
        field.setAccessible(true);
        System.out.println("Previous value : " + field.get(main));
        field.set(main,30);
        System.out.println("Current value : " + field.get(main));
    }
}
