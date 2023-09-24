package designpattern.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

    private static final List<String> BANNED_SITES;
    private final Internet internet = new RealInternet();

    static {
        BANNED_SITES = new ArrayList<>();
        BANNED_SITES.add("google.com");
    }

    @Override
    public void connectTo(String host) {
        if (BANNED_SITES.contains(host)) {
            System.out.println("Access Denied!");
            return;
        }
        internet.connectTo(host);
    }
}
