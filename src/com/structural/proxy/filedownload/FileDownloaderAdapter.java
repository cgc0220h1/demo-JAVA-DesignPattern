package com.structural.proxy.filedownload;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

import java.io.IOException;
import java.net.URL;

public class FileDownloaderAdapter {
    Downloader downloader = new FileDownloaderProxy();

    public void download(String address, String pathDest) throws IOException {
        URL url = new URL(address);
        downloader.download(url, pathDest);
    }
}
