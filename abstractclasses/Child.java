package abstractclasses;

public class Child extends Parent{
    @Override
    void print() {
        System.out.println("hiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    public static void main(String[] args) {
        Parent parent = new Child();
        parent.print();
    }
}
