package lambda;

public class RunnableExample {


    public static void main(String[] args) {

        Runnable r1 = () -> System.out.println("hi me from thread "+Thread.currentThread().getName());
        Thread t1 = new Thread(() -> System.out.println("hi xxx from thread " + Thread.currentThread().getName()));
        t1.start();
        r1.run();
        System.out.println("hi me from thread " + Thread.currentThread().getName());
    }
}
