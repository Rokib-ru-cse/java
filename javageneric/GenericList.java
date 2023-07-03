package javageneric;

public class GenericList <T> implements Comparable<GenericList>{
    public T value;

    public GenericList(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public int compareTo(GenericList o) {
        return this.value.compareTo(o.value);
    }
}
