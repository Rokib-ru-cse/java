package reflection;

import java.io.Serializable;

public class Test implements TestInterface, Serializable, Cloneable, Comparable<Test>, Runnable {
    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public int compareTo(Test o) {
        return 0;
    }

    @Override
    public void run() {

    }
}
