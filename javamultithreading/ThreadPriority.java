package javamultithreading;

class ThreadPriorityThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" threadpriority is = "+Thread.currentThread().getPriority());
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        ThreadPriorityThread t1 = new ThreadPriorityThread();
        System.out.println(Thread.currentThread().getName()+" threadpriority is = "+Thread.currentThread().getPriority());
        System.out.println(t1.getName()+" threadpriority is = "+t1.getPriority());
        t1.start();
        t1.setPriority(7);
    }
}