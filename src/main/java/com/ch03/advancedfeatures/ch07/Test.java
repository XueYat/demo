package com.ch03.advancedfeatures.ch07;

import java.io.*;

/**
 * @author YatXue
 * @date 2019/6/21 15:02
 */
public class Test {
    public static void main(String[] args) {
        write();
    }

    public static void byteStr(){
        File file = new File("d:/a.txt");
        StringBuffer stringBuffer = new StringBuffer();
        try {
            Reader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            char[] arr = new char[10];
            fileReader.read(arr);
            stringBuffer.append(arr);
            System.out.println(stringBuffer.toString().trim());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void line(){
        File file = new File("d:/a.txt");
        StringBuffer stringBuffer = new StringBuffer();
        Reader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String str = "";
            while ((str = bufferedReader.readLine()) != null){
                stringBuffer.append(str);
            }
            System.out.println(stringBuffer.toString().trim());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void write(){
        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        try {
            fos = new FileOutputStream("d:/news.txt");
            osw = new OutputStreamWriter(fos, "utf-8");
            bw = new BufferedWriter(osw);
            String str = "收件地址：贵州省贵阳市观山湖区林城西路8号摩根中心A栋20层\n" +
                    "收件人：阿里云信息认证部 （收）\n" +
                    "邮编：550081\n" +
                    "邮寄联系电话：18586949808；（该电话法定工作日9:00-18:00提供邮寄咨询）\n" +
                    "纸质备案资料清单：";
            bw.write(str);
            bw.flush();
            System.out.println("写入成功");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bw.close();
                osw.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
