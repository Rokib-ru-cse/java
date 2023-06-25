package javamultithreading;

class SimpleThreadThread extends Thread{

    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" print "+i);
        }
    }
}

public class SimpleThread{
    public static void main(String[] args){
        SimpleThreadThread t1 = new SimpleThreadThread();
        SimpleThreadThread t2 = new SimpleThreadThread();
        t1.start();
        t2.start();
    }
}