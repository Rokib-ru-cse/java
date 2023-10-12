package designpattern.creational.singletonpattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionAttack {


    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Singleton5> singleton5Class = Singleton5.class;
        Constructor<Singleton5> singleton5Constructor = singleton5Class.getDeclaredConstructor();

        singleton5Constructor.setAccessible(true);

        Singleton5 singleton5 = Singleton5.INSTANCE;
        Singleton5 newInstanceOfSingleton5 = singleton5Constructor.newInstance();
        System.out.println(singleton5 == newInstanceOfSingleton5);
    }
}


