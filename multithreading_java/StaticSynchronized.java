package multithreading_java;

class HelloStaticSynchronized{
    public static synchronized void hello(){
        for (int i = 0; i < 5; i++) {
            System.out.print("hello from ");
            try{
                System.out.println(Thread.currentThread().getName());
                // Thread.sleep(2000);
            }catch(Exception e){}
        }
    }
}

class StaticSynchronizedThread extends Thread{
    HelloStaticSynchronized h;
    StaticSynchronizedThread(HelloStaticSynchronized hx){
        h = hx;
    }
    @Override
    public void run() {
        HelloStaticSynchronized.hello();
    }
}

public class StaticSynchronized {
    public static void main(String[] args) {
        HelloStaticSynchronized h1 = new HelloStaticSynchronized();
        HelloStaticSynchronized h2 = new HelloStaticSynchronized();
        StaticSynchronizedThread t1 = new StaticSynchronizedThread(h1);
        StaticSynchronizedThread t2 = new StaticSynchronizedThread(h2);
        t1.start();
        t2.start();
    }
}
