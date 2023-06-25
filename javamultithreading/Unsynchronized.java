package javamultithreading;

class UnsynchronizedThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print("Hello to ");
            try {
                sleep(500);
            } catch (Exception e) {}
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class Unsynchronized {
    public static void main(String[] args) {
        UnsynchronizedThread t1 = new UnsynchronizedThread();
        UnsynchronizedThread t2 = new UnsynchronizedThread();
        t1.start();
        t2.start();
    }
}
