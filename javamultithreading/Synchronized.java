package javamultithreading;

class HelloSynchronized {
    public synchronized void hello() {

        for (int i = 0; i < 5; i++) {
            System.out.print("hello from ");
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
    }
}

class SynchronizedThread extends Thread {
    HelloSynchronized h;

    SynchronizedThread(HelloSynchronized h) {
        this.h = h;
    }

    @Override
    public void run() {
        h.hello();
    }
}

public class Synchronized {
    public static void main(String[] args) {
        HelloSynchronized h = new HelloSynchronized();
        SynchronizedThread t1 = new SynchronizedThread(h);
        SynchronizedThread t2 = new SynchronizedThread(h);
        t1.start();
        t2.start();
    }
}
