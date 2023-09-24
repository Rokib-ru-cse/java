package designpattern.structural.proxy;

public class RealInternet implements Internet {
    @Override
    public void connectTo(String host) {
        System.out.println("Opened Connection to " + host);
    }
}
