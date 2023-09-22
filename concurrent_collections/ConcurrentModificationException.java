package concurrent_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationException extends Thread{

    static ArrayList<Integer> integerList = new ArrayList<>();

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        }catch (Exception e){
        }
        System.out.println("child thread ");
        integerList.add(1);
    }
    public static void main(String[] args) throws InterruptedException {
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);

        ConcurrentModificationException exception = new ConcurrentModificationException();
        exception.start();
        Iterator<Integer> iterator = integerList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            Thread.sleep(3000);
        }
    }
}
