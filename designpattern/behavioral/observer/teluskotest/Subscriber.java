package designpattern.behavioral.observer.teluskotest;

import java.util.ArrayList;
import java.util.List;

public class Subscriber implements Observer{

    String name;
    List<Observable> observableList = new ArrayList<>();

    public Subscriber(String name){
        this.name = name;
    }

    @Override
    public void subscribe(Observable observable) {
        observableList.add(observable);
    }

    @Override
    public void update(Observable observable) {
        System.out.println(observable.getTitle());
    }
}
