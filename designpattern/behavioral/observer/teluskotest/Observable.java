package designpattern.behavioral.observer.teluskotest;

public interface Observable {



    void subscribe(Observer observer);


    void unSubscribe(Observer observer);

    void notifyAllS();


    void upload(String title);
    String getTitle();
}
