package designpattern.behavioral.observer.casetwo;

public interface Observer {
    void update();

    void subscribeChannel(Subject ch);
}
