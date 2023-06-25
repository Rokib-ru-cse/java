package javamultithreading;

class SimpleRunnableThread implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" print "+i);
        }
    }
}

public class SimpleRunnable {
    public static void main(String[] args) {
        SimpleRunnableThread t1 = new SimpleRunnableThread();
        SimpleRunnableThread t2 = new SimpleRunnableThread();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();
    }
}
