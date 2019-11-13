package com.ch03.advancedfeatures.ch07;

import java.io.*;

/**
 * @author YatXue
 * @date 2019/6/22 10:21
 */
public class Replace {
    public static void main(String[] args) {
        File file = new File("d:/pet.txt");
        File file1 = new File("d:/pet.txt");
        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        try {
            fos = new FileOutputStream(file);
            osw = new OutputStreamWriter(fos);
            bw = new BufferedWriter(osw);
            String str = "您好！我的名字是{name}，我是一只{type}，我的主人是{master}";
            bw.write(str);
            bw.flush();

            fis = new FileInputStream(file);
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            String beforeStr = br.readLine();
            System.out.println("替换前：" + beforeStr);

            beforeStr = beforeStr.replace("{name}", "旺财");
            beforeStr = beforeStr.replace("{type}", "狗子");
            beforeStr = beforeStr.replace("{master}", "张三");
            fos = new FileOutputStream(file1);
            osw = new OutputStreamWriter(fos);
            bw = new BufferedWriter(osw);
            bw.write(beforeStr);
            bw.flush();

            fis = new FileInputStream(file1);
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            String afterStr = br.readLine();
            System.out.println("替换后：" + afterStr);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
