package lambda;

@FunctionalInterface
public interface MyInter {
    void print();
    default void print1(){
        System.out.println("Ssssssssssssssss");
    }
}


