package javamultithreading;

class SleepAndInterruptThread extends Thread {
    @Override
    public void run() {
        System.out.println("start child thread");
        try {
            System.out.println("child is sleeping");
            sleep(5000);
        } catch (Exception e) {
            System.out.println("child got interrupt");
        }
    }
}

public class SleepAndInterrupt {
    public static void main(String[] args) {
        SleepAndInterruptThread t1 = new SleepAndInterruptThread();
        t1.start();
        t1.interrupt(); // when child thread enter into sleep or waiting state then will got interrupt
                        // if don't enter then don't got interrupt
        System.out.println("end of main thread");
    }
}
