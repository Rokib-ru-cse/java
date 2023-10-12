package designpattern.creational.singletonpattern;

public class Singleton {
}

/**
 * Eager Initialization:
 * In this approach, the Singleton instance is created when the class is loaded.
 * It guarantees thread safety but may result in unnecessary instance creation
 * if the Singleton is not always needed.
 */
class Singleton1 {
    private static final Singleton1 singleton1 = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getSingleton1() {
        return singleton1;
    }
}


/**
 * Lazy Initialization (Not Thread-Safe):
 * This approach initializes the Singleton instance when it is first requested. It is not thread-safe, so additional synchronization is needed to make it thread-safe.
 */
class Singleton2 {
    private static Singleton2 singleton2;

    private Singleton2() {
    }

    public static Singleton2 getSingleton2() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}

/**
 * Lazy Initialization with Double-Check Locking (Thread-Safe):
 * This approach uses double-check locking to ensure thread safety while also deferring instance creation until the first call to getInstance. It is a bit more complex due to the need for synchronization.
 */
class Singleton3 {

    private static Singleton3 singleton3;

    private Singleton3() {
    }

    public static Singleton3 getSingleton3() {

        if (singleton3 == null) {
            synchronized (Singleton3.class) {
                if (singleton3 == null) {
                    singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;
    }
}

/**
 * Bill Pugh Singleton (Initialization-on-Demand Holder):
 * This is a thread-safe and efficient approach that uses a nested inner class to handle the Singleton instance creation.
 */
class Singleton4 {

    private Singleton4() {
    }

    private static class SingletonHolder {
        private static final Singleton4 singleton4 = new Singleton4();

    }

    public static Singleton4 getSingleton4() {
        return SingletonHolder.singleton4;
    }

}

/**
 * Enum Singleton (Effective Java recommended approach):
 * Effective Java by Joshua Bloch recommends using an enum for Singleton implementation, as it provides thread safety, serialization safety, and simplicity.
 */
enum Singleton5 {
    INSTANCE;
}
