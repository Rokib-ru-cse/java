package designpattern.creational.factorypattern;

public class Doctor implements Profession{
    @Override
    public void print() {
        System.out.println("i am doctor");
    }
}
