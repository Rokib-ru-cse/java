package designpattern.behavioral.observer.telusko;

public interface Observer {
    void update();

    void subscribeChannel(Subject ch);
}
