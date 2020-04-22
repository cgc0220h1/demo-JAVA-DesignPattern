package com.structural.proxy.filedownload;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Downloader downloader = new FileDownloaderProxy();
        String defaultPath = "F:/Users/Duc/Desktop/test/anyDesk.exe";
        String address = "https://download.anydesk.com/AnyDesk.exe";
        //Download bằng proxy phải tạo một đối tượng URL
        try {
            URL url = new URL(address);
            downloader.download(url, defaultPath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Vì việc download trên khó sử dụng với User hay các dev khác. Nên dùng một Adapter để
        //Thay đổi đầu vào thành String, giúp dễ sử dụng hơn.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Address: ");
        String newAddress = scanner.nextLine();
        System.out.println("Enter Path: ");
        String newPath = scanner.nextLine();
        FileDownloaderAdapter downloaderAdapter = new FileDownloaderAdapter();
        try {
            downloaderAdapter.download(newAddress, newPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
