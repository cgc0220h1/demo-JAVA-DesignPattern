package com.structural.proxy.filedownload;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

import java.io.IOException;
import java.net.URL;

public class FileDownloaderProxy implements Downloader {
    Downloader fileDownloader;

    public FileDownloaderProxy() {
        fileDownloader = new FileDownloader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.113 Safari/537.36 Edg/81.0.416.58");
    }

    public FileDownloaderProxy(String userAgent) {
        fileDownloader = new FileDownloader(userAgent);
    }

    @Override
    public void download(URL url, String destPath) throws IOException {
        fileDownloader.download(url, destPath);
    }
}
