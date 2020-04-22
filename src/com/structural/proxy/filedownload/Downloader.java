package com.structural.proxy.filedownload;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

import java.io.IOException;
import java.net.URL;

public interface Downloader {
    void download(URL url, String destPath) throws IOException;
}
