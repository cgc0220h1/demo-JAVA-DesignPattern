package com.structural.proxy.filedownload;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

import javax.print.DocFlavor;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class FileDownloader implements Downloader {
    private String userAgent;

    public FileDownloader(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public void download(URL url, String pathDest) throws IOException {
        URLConnection connection = url.openConnection();
        connection.setRequestProperty("User-Agent", userAgent);
        InputStream inputStream = connection.getInputStream();
        File file = new File(pathDest);
        FileOutputStream fileOut = new FileOutputStream(file);
        int bytesRead;
        byte[] buffer = new byte[8192];
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            fileOut.write(buffer, 0, bytesRead);
        }
        fileOut.close();
        inputStream.close();
    }
}
