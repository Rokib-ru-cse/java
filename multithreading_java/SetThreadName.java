package multithreading_java;

class SetThreadNameThread extends Thread{
    public void run(){
        Thread.currentThread().setName("ThreadRokib");
        System.out.println("From "+Thread.currentThread().getName());
    }
}

public class SetThreadName {
    public static void main(String[] args) {
        SetThreadNameThread t1 = new SetThreadNameThread();
        t1.start();
        System.out.println("From "+Thread.currentThread().getName());
    }    
}
