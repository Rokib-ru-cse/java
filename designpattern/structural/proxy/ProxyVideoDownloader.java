package designpattern.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyVideoDownloader implements VideoDownloader {
    private final Map<String, String> cachedVideo = new HashMap<>();
    private final VideoDownloader videoDownloader = new RealVideoDownloader();

    @Override
    public String getVideo(String videoName) {
        if (!cachedVideo.containsKey(videoName)) {
            cachedVideo.put(videoName, videoDownloader.getVideo(videoName));
        }
        return cachedVideo.get(videoName);
    }
}
