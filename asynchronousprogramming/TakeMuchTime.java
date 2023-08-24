package asynchronousprogramming;

public class TakeMuchTime {

    private static void print(int data) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(data);
    }

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 10; i++) {
            print(i);
        }
    }
}
