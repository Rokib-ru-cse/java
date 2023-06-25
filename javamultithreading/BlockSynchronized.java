package javamultithreading;

class HelloBlockSynchronized {
    public void hello() {
        // synchronized (this) { get object level lock
            synchronized(HelloBlockSynchronized.class){ //get class level lock
            
                for (int i = 0; i < 5; i++) {
                System.out.print("hello from ");
                try {
                    System.out.println(Thread.currentThread().getName());
                } catch (Exception e) {
                }
            }
        }
    }
}

class BlockSynchronizedThread extends Thread {
    HelloBlockSynchronized h;

    BlockSynchronizedThread(HelloBlockSynchronized h) {
        this.h = h;
    }

    @Override
    public void run() {
        h.hello();
    }
}

public class BlockSynchronized {
    public static void main(String[] args) {
        HelloBlockSynchronized d = new HelloBlockSynchronized();
        BlockSynchronizedThread t1 = new BlockSynchronizedThread(d);
        BlockSynchronizedThread t2 = new BlockSynchronizedThread(d);
        t1.start();
        t2.start();
    }
}
