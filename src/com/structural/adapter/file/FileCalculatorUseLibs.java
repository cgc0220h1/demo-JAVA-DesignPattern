package com.structural.adapter.file;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

import com.codegym.FileUtil;

import java.io.File;

public class FileCalculatorUseLibs implements FileCalculator {

    @Override
    public long calculateSize(String path) {
        FileUtil fileUtil = new FileUtil();
        File file = new File(path);
        return fileUtil.calculateSize(file);
    }
}
