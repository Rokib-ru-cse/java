package multithreading_java;

class OverrideStartThread extends Thread{

    public void start(){
        super.start();
        System.out.println("from start method");
    }
    
    public void run(){
        System.out.println("from run method");
    }
}

public class OverrideStart {
    public static void main(String[] args) {
        OverrideStartThread t1 = new OverrideStartThread();
        t1.start();
        System.out.println("from main thread");
    }
}
