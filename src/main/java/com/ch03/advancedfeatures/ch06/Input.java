package com.ch03.advancedfeatures.ch06;

import java.io.*;

/**
 * @author YatXue
 * @date 2019/6/19 17:18
 */
public class Input {
    public static void main(String[] args) {
        File file = new File("d:/test.txt");
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(file);
            fos = new FileOutputStream("d:/demo.txt");
            int data;
            while((data = fis.read()) != -1){
                fos.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
