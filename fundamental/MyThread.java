package fundamental;
public class MyThread {
    public static void main(String[] args) {
        BigThread bt = new BigThread();
        Thread st = new Thread(new SmallThread());
        st.start();
        bt.start();

    }
}

class BigThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 190; i++) {
            System.out.println(Thread.currentThread().getName());
        } 
    }

}

class SmallThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName());
        }        
    }

}
