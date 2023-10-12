package java8.lambda;

public class AnonymousClass {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous() {
            @Override
            public void print() {
                System.out.println("hi from anonymous class");
            }
        };
        anonymous.print();
    }
}

@FunctionalInterface
interface Anonymous {
    void print();
}




