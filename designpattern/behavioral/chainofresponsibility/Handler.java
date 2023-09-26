package designpattern.behavioral.chainofresponsibility;

public interface Handler {
    boolean handle(String username, String password);

    Handler setNextHandler(Handler next);
}
