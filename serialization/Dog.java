package serialization;

import java.io.Serializable;

public class Dog implements Serializable {
    public static final long serialVersionUID = 1;
    int i=10;
    int j = 20;

    @Override
    public String toString() {
        return "Dog{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }
}
