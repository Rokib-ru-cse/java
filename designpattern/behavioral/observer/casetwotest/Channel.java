package designpattern.behavioral.observer.casetwotest;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Observable {

    public String title;

    List<Observer> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unSubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyAllS() {
        for (Observer subs : subscribers) {
            subs.update(this);
        }
    }

    @Override
    public void upload(String title) {
        this.title = title;
        notifyAllS();
    }

    @Override
    public String getTitle() {
        return this.title;
    }
}
