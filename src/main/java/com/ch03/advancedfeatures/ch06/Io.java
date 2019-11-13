package com.ch03.advancedfeatures.ch06;

import java.io.File;
import java.io.IOException;

/**
 * @author YatXue
 * @date 2019/6/19 14:25
 */
public class Io {
    public static void main(String[] args) {
        String path = "d:/test.txt";
        File file = new File(path);
        System.out.println("是否是文件：" + file.isFile());
        System.out.println("是否是目录：" + file.isDirectory());
        if (file.exists()) {
            if (file.delete()){
                System.out.println("删除成功！");
            }
        }else {
            try {
                if (file.createNewFile()){
                    System.out.println("创建成功！");
                    System.out.println(file.getName() + "的大小为：" + file.length() + "字节");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
