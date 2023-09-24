package designpattern.structural.proxy;

public class RealVideoDownloader implements VideoDownloader {
    @Override
    public String getVideo(String videoName) {
        System.out.println("Connection to https://www.youtube.com/");
        System.out.println("Downloadin Video");
        System.out.println("Retrieving Video Metadata");
        return "video downloaded";
    }
}
