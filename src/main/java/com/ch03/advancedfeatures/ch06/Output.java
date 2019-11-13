package com.ch03.advancedfeatures.ch06;

import java.io.*;

/**
 * @author YatXue
 * @date 2019/6/19 15:37
 */
public class Output {
    public static void main(String[] args) {
        File file = new File("d:/ztest");
        System.out.println("删除：" + file.delete());
        System.out.println("创建：" + file.mkdir());
        File file1 = new File("d:/ztest/test.txt");
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file1);
            String str = "Hello World";
            byte[] arr = str.getBytes();
            fileOutputStream.write(arr, 6, 5);
            fileInputStream = new FileInputStream(file1);
            int strb;
            while ((strb = fileInputStream.read()) != -1){
                System.out.println((char)strb);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
