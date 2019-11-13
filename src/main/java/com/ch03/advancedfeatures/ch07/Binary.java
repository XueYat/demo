package com.ch03.advancedfeatures.ch07;

import java.io.*;

/**
 * @author YatXue
 * @date 2019/6/22 10:52
 */
public class Binary {
    public static void main(String[] args) {
        File file = new File("d:/user.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);
            DataInputStream dis = new DataInputStream(bis);
            System.out.println(dis.available());
            int data;
            while ((data = dis.read()) != -1) {
                System.out.print((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
