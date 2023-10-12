package designpattern.creational.singletonpattern;

public class SingletonPatternClass {

    private static SingletonPatternClass singletonPatternClass = new SingletonPatternClass();

    private SingletonPatternClass() {

    }

    public static SingletonPatternClass getInstance() {
        return singletonPatternClass;
    }

}
