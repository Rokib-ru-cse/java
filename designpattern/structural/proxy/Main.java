package designpattern.structural.proxy;

public class Main {

    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        internet.connectTo("google.com");


        VideoDownloader videoDownloader = new ProxyVideoDownloader();
        videoDownloader.getVideo("hi");
        videoDownloader.getVideo("hi");
    }
}
