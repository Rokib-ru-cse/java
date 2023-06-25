package javamultithreading;

class JoinMethodThread extends Thread {
    static Thread mainThread;

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " calles join nethod ");
            mainThread.join(2000); // as child thread calls mainThread.join() so child thread will wait untill main
                                   // ends and wait just 2 second if main not complete then start own
        } catch (Exception e) {
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " print " + i);
        }
    }
}

public class JoinMethod {
    public static void main(String[] args) throws InterruptedException {
        JoinMethodThread.mainThread = Thread.currentThread();// send main thread
        JoinMethodThread t1 = new JoinMethodThread();
        JoinMethodThread t2 = new JoinMethodThread();
        t1.start();
        System.out.println(Thread.currentThread().getName() + " calles join nethod ");
        // t1.join(); //as main thread calls t1.join() so main thread will wait untill
        // t1 ends
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " print " + i);
        }
    }
}
