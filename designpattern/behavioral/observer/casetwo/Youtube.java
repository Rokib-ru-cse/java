package designpattern.behavioral.observer.casetwo;

public class Youtube {

    public static void main(String[] args) {
        Subject telesku = new Channel();

        Subscriber s1 = new Subscriber("rokib");
        Subscriber s2 = new Subscriber("shadin");
        Subscriber s3 = new Subscriber("subscriber one");
        Subscriber s4 = new Subscriber("subscriber two");
        Subscriber s5 = new Subscriber("subscriber three");

        telesku.subscribe(s1);
        telesku.subscribe(s2);
        telesku.subscribe(s3);
        telesku.subscribe(s4);
        telesku.subscribe(s5);

        s1.subscribeChannel(telesku);
        s2.subscribeChannel(telesku);
        s3.subscribeChannel(telesku);
        s4.subscribeChannel(telesku);
        s5.subscribeChannel(telesku);

        telesku.upload("learn java");

    }

}
