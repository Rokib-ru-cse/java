package javamultithreading;

class YieldMethodThread extends Thread{
    @Override
    public void run() {
        Thread.yield();
        System.out.println("yield from "+Thread.currentThread().getName());
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" print "+i);
        }
    }
}

public class YieldMethod {
    public static void main(String[] args) {
        YieldMethodThread t1 = new YieldMethodThread();
        t1.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" print "+i);
        }
    }
}
