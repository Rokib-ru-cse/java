package designpattern.behavioral.observer.casetwotest;

public interface Observable {



    void subscribe(Observer observer);


    void unSubscribe(Observer observer);

    void notifyAllS();


    void upload(String title);
    String getTitle();
}
