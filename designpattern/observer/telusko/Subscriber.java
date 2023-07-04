package designpattern.observer.telusko;


import java.util.ArrayList;
import java.util.List;

public class Subscriber implements Observer {

    private String name;

    private List<Subject> channel = new ArrayList<>();

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(){
        System.out.println("hey "+name+" video updated");
    }

    @Override
    public void subscribeChannel(Subject ch){
        channel.add(ch);
    }

}
